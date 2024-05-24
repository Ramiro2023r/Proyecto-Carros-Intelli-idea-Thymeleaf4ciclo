package pe.edu.cibertec.ProyectoLPII.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.ProyectoLPII.Model.*;
import pe.edu.cibertec.ProyectoLPII.Service.*;

import java.util.List;


@Controller
public class InicioController {

    @Autowired
    private IMotoService motoService;

    @Autowired
    private ICamionetaService camionetaService;
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IClienteService clienteService;

    @Autowired
    private ICarroService carroService;
    @Autowired
    private IMarcaService marcaService;

    @Autowired
    private IMarcacaService marcacaService;

    @Autowired
    private IMarcaMotoService marcaMotoService;


    @Autowired
    private ITurnoEmpleadoService turnoEmpleadoService;




    @GetMapping("/cerrado")
    public String sesioncerrada() {
        return "sesionterminada"; // Devuelve la vista del formulario de login (index.html)
    }

   /* @GetMapping("/camioneta")
    public String mostrarFormularioLogin() {
        return "carros"; // Devuelve la vista del formulario de login (index.html)
    }*/
   @RequestMapping("/camioneta")
    public String carros(Model model) {
        model.addAttribute("listaMarcas", marcaService.listarMarcas());
        model.addAttribute("camioneta", new Camioneta());
        model.addAttribute("lista",camionetaService.listarCamionetas());
        return "carros";
    }

    @RequestMapping("/carro")
    public String carrosDepor(Model model) {
        model.addAttribute("listarMarca", marcacaService.listarMarca());
        model.addAttribute("carro", new Carro());
        model.addAttribute("lista",carroService.listarCarro());
        return "carrosdepor";
    }

    @RequestMapping("/moto")
    public String motos(Model model) {
        model.addAttribute("listarMarca", marcaMotoService.listarMarcasMoto());
        model.addAttribute("moto", new Moto());
        model.addAttribute("lista",motoService.listarMotos());
        return "motos";
    }


    @RequestMapping("/empleado")
    public String empleado(Model model) {
        model.addAttribute("listarTurno", turnoEmpleadoService.listarTurnoEmpleado());
        model.addAttribute("empleado", new Empleado());
        model.addAttribute("lista",empleadoService.listarEmpleado());
        return "geempleados";
    }



    @RequestMapping("/cliente")
    public String cliente(Model model) {

        model.addAttribute("cliente", new Cliente());
        model.addAttribute("lista",clienteService.listarCliente());
        return "geclientes";
    }


    @GetMapping("/gevehiculos.html")
    public String mostrarPaginaInicio() {
        return "gevehiculos"; // Devuelve el nombre del archivo HTML sin la extensión
    }
    @GetMapping("/geempleados.html")
    public String mostrarPaginaEmpleados(Model model) {
        List<Empleado> empleados = empleadoService.listarEmpleado();
        model.addAttribute("lista", empleados);
        return "geempleados"; // Devuelve el nombre del archivo HTML sin la extensión
    }
    @GetMapping("/geclientes.html")
    public String mostrarPaginaClientes(Model model) {
        List<Cliente> clientes = clienteService.listarCliente();
        model.addAttribute("lista", clientes);
        return "geclientes"; // Devuelve el nombre del archivo HTML sin la extensión
    }
    @GetMapping("/registroventas.html")
    public String mostrarPaginaResgistroVentas() {
        return "registroventas"; // Devuelve el nombre del archivo HTML sin la extensión
    }

    @GetMapping("/tienda.html")
    public String mostrarTienda() {
        return "tienda"; // Devuelve el nombre del archivo HTML sin la extensión
    }






    @GetMapping("/motos.html")
    public String mostrarMotos(Model model) {
        List<Moto> moto = motoService.listarMotos();
        model.addAttribute("lista", moto);
        return "motos"; // Devuelve el nombre del archivo HTML sin la extensión
    }


    @GetMapping("/carros.html")
    public String mostrarCarros(Model model) {
        List<Camioneta> carros = camionetaService.listarCamionetas();
        model.addAttribute("lista", carros);
        return "carros"; // Devuelve el nombre del archivo HTML sin la extensión
    }


    @GetMapping("/carrosdepor.html")
    public String mostrarCarrosdepor(Model model) {
        List<Carro> carrosdepor = carroService.listarCarro();
        model.addAttribute("lista", carrosdepor);
        return "carrosdepor"; // Devuelve el nombre del archivo HTML sin la extensión
    }


}







