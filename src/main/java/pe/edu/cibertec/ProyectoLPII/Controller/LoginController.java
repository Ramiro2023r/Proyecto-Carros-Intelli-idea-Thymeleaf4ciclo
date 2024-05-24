package pe.edu.cibertec.ProyectoLPII.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.ProyectoLPII.Service.IClienteService;
import pe.edu.cibertec.ProyectoLPII.Service.IUsuarioService;


@Controller
public class LoginController {

    @Autowired
    private IUsuarioService usuarioService;  // Inyecta el servicio de usuarios

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "index"; // Devuelve la vista del formulario de login (index.html)
    }



    @RequestMapping("/Menup")
    public String inicioc(Model model) {

        return "inicio";
    }


   /* @PostMapping("/login")
    public String procesarLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Procesa la solicitud de login
        boolean validado = usuarioService.validarUsuario(username, password);

        if (validado) {
            // El usuario es válido, redirige a la página de inicio o a donde sea necesario
           //return "redirect:inicio";//

            return "inicio";
        } else {
            // El usuario no es válido, muestra un mensaje de error
            model.addAttribute("error", "Credenciales inválidas.Inténtalo de nuevo.");
            return "index";
        }
    }*/
}
