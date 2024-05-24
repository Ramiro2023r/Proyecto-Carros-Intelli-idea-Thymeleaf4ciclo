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
import pe.edu.cibertec.ProyectoLPII.Model.Cliente;
import pe.edu.cibertec.ProyectoLPII.Service.IClienteService;
import pe.edu.cibertec.ProyectoLPII.Service.ISexoService;

import java.util.List;


@Controller
@AllArgsConstructor
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @Autowired
    private ISexoService sexoService;



   /* @RequestMapping("/cliente")
    public String geclientes(Model model) {
        model.addAttribute("lista",clienteService.listarCliente());
        return "geclientes";
    }*/


    @RequestMapping("/consultarcliente")
    public String consultar(Cliente cliente, Model model) {
        model.addAttribute("lista",clienteService.listar(cliente));
        return "geclientes";
    }











    @GetMapping("/registrarclientes/{id}")
    public String mostrarCliente(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("listSexo", sexoService.listarSexo());
        if (id != null && id !=0 ) {
            model.addAttribute("cliente", clienteService.obtenerCliente(id));
        } else {
            model.addAttribute("cliente", new Cliente());
        }
        return "guardarclientes";
    }

    @PostMapping("/registrarclientes")
    public String registrarModificar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attribute) {
        if (result.hasErrors()) {
            model.addAttribute("listSexo",sexoService.listarSexo());
            System.out.println("Existen errores en el formulario");
            return "guardarclientes";
        }
        clienteService.registrarCliente(cliente);
        System.out.println("Cliente guardada con éxito!");
        attribute.addFlashAttribute("success", "Cliente guardada con éxito!");





        return "redirect:/cliente";


    }


    @GetMapping("/eliminarclientes/{id}")
    public String eliminarCliente(@PathVariable("id") Integer id, Model model, RedirectAttributes attribute) {
        clienteService.eliminarCliente(id);
        System.out.println("Cliente eliminada con éxito!");
        attribute.addFlashAttribute("warning", "Cliente eliminada con éxito!");
        return "redirect:/cliente";
    }
}
