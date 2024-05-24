package pe.edu.cibertec.ProyectoLPII.Controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Service.ICamionetaService;

import pe.edu.cibertec.ProyectoLPII.Service.IEstadoService;
import pe.edu.cibertec.ProyectoLPII.Service.IMarcaService;
import pe.edu.cibertec.proyecto.service.ICombustibleService;


@Controller
@AllArgsConstructor
public class CamionetaController {
    @Autowired
    private ICamionetaService camionetaService;

    @Autowired
    private IMarcaService marcaService;

    @Autowired
    private ICombustibleService combustibleService;

    @Autowired
    private IEstadoService estadoService;




   /* @RequestMapping("/camioneta")
    public String carros(Model model) {
        model.addAttribute("lista",camionetaService.listarCamionetas());
        return "carros";
    }*/

    @RequestMapping("/consultarcarros")
    public String consultar(Camioneta camioneta, Model model) {
        model.addAttribute("listaMarcas", marcaService.listarMarcas());
        model.addAttribute("lista",camionetaService.listar(camioneta));
        return "carros";
    }
    @GetMapping("/registrarcarros/{id}")
    public String mostrarCamioneta(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("listMarcas", marcaService.listarMarcas());
        model.addAttribute("listCombustibles", combustibleService.listarCombustibles());
        model.addAttribute("listEstados", estadoService.listarEstados());
        if (id != null && id !=0 ) {
            model.addAttribute("camioneta", camionetaService.obtenerCamioneta(id));
        } else {
            model.addAttribute("camioneta", new Camioneta());
        }
        return "guardarcarros";
    }

    @PostMapping("/registrarcarros")
    public String registrarModificar(@Valid Camioneta camioneta, BindingResult result, Model model, RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("listMarcas",marcaService.listarMarcas());
            model.addAttribute("listCombustibles",combustibleService.listarCombustibles());
            model.addAttribute("listEstados",estadoService.listarEstados());
            System.out.println("Existen errores en el formulario");
            return "guardarcarros";
        }
        camionetaService.registrarCamioneta(camioneta);
        System.out.println("Camioneta guardada con éxito!");
        attribute.addFlashAttribute("success", "Camioneta guardada con éxito!");
        return "redirect:/camioneta";
    }


    @GetMapping("/eliminarcarros/{id}")
    public String eliminarCamioneta(@PathVariable("id") Integer id, Model model, RedirectAttributes attribute) {
        camionetaService.eliminarCamioneta(id);
        System.out.println("Camioneta eliminada con éxito!");
        attribute.addFlashAttribute("warning", "Camioneta eliminada con éxito!");
        return "redirect:/camioneta";
    }
}