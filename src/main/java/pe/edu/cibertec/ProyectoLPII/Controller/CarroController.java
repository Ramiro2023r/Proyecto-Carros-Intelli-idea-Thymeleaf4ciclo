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
import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Service.*;


@Controller
@AllArgsConstructor
public class CarroController {
    @Autowired
    private ICarroService carroService;

    @Autowired
    private IMarcacaService marcaService;

    @Autowired
    private IEstadocaService estadoService;



   /* @RequestMapping("/carro")
    public String carros(Model model) {
        model.addAttribute("lista",carroService.listarCarro());
        return "carrosdepor";
    }*/



    @RequestMapping("/consultarcarrosdepor")
    public String consultardepor(Carro carro, Model model) {
        model.addAttribute("listarMarca", marcaService.listarMarca());
        model.addAttribute("lista",carroService.listarr(carro));
        return "carrosdepor";
    }





    @GetMapping("/registrardepor/{id}")
    public String mostrarCarro(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("listEstado", estadoService.listarEstado());
        model.addAttribute("listMarca", marcaService.listarMarca());
        if (id != null && id !=0 ) {
            model.addAttribute("carro", carroService.obtenerCarro(id));
        } else {
            model.addAttribute("carro", new Carro());
        }
        return "guardarcadepor";
    }

    @PostMapping("/registrardepor")
    public String registrarModificar(@Valid Carro carro, BindingResult result, Model model, RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("listEstado", estadoService.listarEstado());
            model.addAttribute("listMarca", marcaService.listarMarca());
            System.out.println("Existen errores en el formulario");
            return "guardarcadepor";
        }
        carroService.registrarCarro(carro);
        System.out.println("Carro guardado con éxito!");
        attribute.addFlashAttribute("success", "Carro guardado con éxito!");
        return "redirect:/carro";
    }


    @GetMapping("/eliminardepor/{id}")
    public String eliminarCarro(@PathVariable("id") Integer id, Model model, RedirectAttributes attribute) {
        carroService.eliminarCarro(id);
        System.out.println("Carro eliminado con éxito!");
            attribute.addFlashAttribute("warning", "Carro eliminado con éxito!");
        return "redirect:/carro";
    }
}