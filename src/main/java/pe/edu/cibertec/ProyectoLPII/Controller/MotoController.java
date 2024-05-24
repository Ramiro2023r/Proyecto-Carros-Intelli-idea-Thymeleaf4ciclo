package pe.edu.cibertec.ProyectoLPII.Controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Model.Moto;
import pe.edu.cibertec.ProyectoLPII.Service.IMarcaMotoService;
import pe.edu.cibertec.ProyectoLPII.Service.IMotoService;
import pe.edu.cibertec.ProyectoLPII.Service.ITipoMotoService;


@Controller
@AllArgsConstructor
public class MotoController {
    @Autowired
    private IMotoService motoService;

    @Autowired
    private IMarcaMotoService marcaMotoService;

    @Autowired
    private ITipoMotoService tipoMotoService;

    /*@RequestMapping("/moto")
    public String motos(Model model) {
        model.addAttribute("lista",motoService.listarMotos());
        return "motos";
    }*/

    @RequestMapping("/consultarMoto")
    public String consultarMoto(Moto moto, Model model) {
        model.addAttribute("listarMarca", marcaMotoService.listarMarcasMoto());
        model.addAttribute("lista",motoService.listarm(moto));
        return "motos";
    }


    @GetMapping("/registrarmotos/{id}")
    public String mostrarMoto(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("listMarcasMoto",marcaMotoService.listarMarcasMoto());
        model.addAttribute("listTiposMoto",tipoMotoService.listarTiposMoto());
        if (id != null && id !=0 ) {
            model.addAttribute("moto", motoService.obtenerMoto(id));
        } else {
            model.addAttribute("moto", new Moto());
        }
        return "guardarmotos";
    }

    @PostMapping("/registrarmotos")
    public String registrarModificar(@Valid Moto moto, BindingResult result, Model model, RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("listMarcasMoto",marcaMotoService.listarMarcasMoto());
            model.addAttribute("listTiposMoto",tipoMotoService.listarTiposMoto());
            System.out.println("Existen errores en el formulario");
            return "guardarmotos";
        }
        motoService.registrarMoto(moto);
        System.out.println("Articulo guardado con éxito!");
        attribute.addFlashAttribute("success", "Articulo guardado con éxito!");
        return "redirect:/moto";
    }

    @GetMapping("/eliminarmotos/{id}")
    public String eliminarMoto(@PathVariable("id") Integer id, Model model, RedirectAttributes attribute) {
        motoService.eliminarMoto(id);
        System.out.println("Articulo eliminado con éxito!");
        attribute.addFlashAttribute("warning", "Articulo eliminado con éxito!");
        return "redirect:/moto";
    }
}
