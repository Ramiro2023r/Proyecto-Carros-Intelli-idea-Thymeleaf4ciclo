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
import pe.edu.cibertec.ProyectoLPII.Model.Empleado;
import pe.edu.cibertec.ProyectoLPII.Service.IEmpleadoService;
import pe.edu.cibertec.ProyectoLPII.Service.IAportesEmpleadoService;
import pe.edu.cibertec.ProyectoLPII.Service.IRolEmpleadoService;
import pe.edu.cibertec.ProyectoLPII.Service.ITurnoEmpleadoService;

import java.util.List;


@Controller
@AllArgsConstructor
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IAportesEmpleadoService aportesEmpleadoService;

    @Autowired
    private IRolEmpleadoService rolEmpleadoService;


    @Autowired
    private ITurnoEmpleadoService turnoEmpleadoService;



  /*  @RequestMapping("/empleado")
    public String geempleados(Model model) {
        model.addAttribute("lista",empleadoService.listarEmpleado());
        return "geempleados";
    }*/


    @RequestMapping("/consultarEmpleado")
    public String consultarempleado(Empleado empleado, Model model) {
        model.addAttribute("listarTurno", turnoEmpleadoService.listarTurnoEmpleado());
        model.addAttribute("lista",empleadoService.listar(empleado));
        return "geempleados";
    }




    @GetMapping("/registrarempleado/{id}")
    public String mostrarEmpleado(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("listAportesEmpleado", aportesEmpleadoService.listarAportesEmpleado());
        model.addAttribute("listRolEmpleado", rolEmpleadoService.listarRolEmpleado());
        model.addAttribute("listTurnoEmpleado", turnoEmpleadoService.listarTurnoEmpleado());
        if (id != null && id !=0 ) {
            model.addAttribute("empleado", empleadoService.obtenerEmpleado(id));
        } else {
            model.addAttribute("empleado", new Empleado());
        }
        return "guardar";
    }

    @PostMapping("/registrarempleado")
    public String registrarModificar(@Valid Empleado empleado, BindingResult result, Model model, RedirectAttributes attribute) {

        if (result.hasErrors()) {
            model.addAttribute("listAportesEmpleado", aportesEmpleadoService.listarAportesEmpleado());
            model.addAttribute("listRolEmpleado", rolEmpleadoService.listarRolEmpleado());
            model.addAttribute("listTurnoEmpleado", turnoEmpleadoService.listarTurnoEmpleado());
            System.out.println("Existen errores en el formulario");
            return "guardar";
        }
        empleadoService.registrarEmpleado(empleado);
        System.out.println("Empleado guardado con éxito!");
        attribute.addFlashAttribute("success", "Empleado guardado con éxito!");
        return "redirect:/empleado";




        //alumnoService.registrarAlumnos(alumno);
        //return "redirect:/alumno";
    }


    @GetMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable("id") Integer id, Model model , RedirectAttributes attribute) {
      empleadoService.eliminarEmpleado(id);
        System.out.println("Empleado Eliminado con éxito!");
         attribute.addFlashAttribute("warning", "Empleado eliminado con éxito!");
        return "redirect:/empleado";




    }
}
