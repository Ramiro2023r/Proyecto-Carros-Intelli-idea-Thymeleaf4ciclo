package pe.edu.cibertec.ProyectoLPII.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Model.Empleado;


import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> listarEmpleado();
    public Empleado obtenerEmpleado(Integer id);
    public Empleado registrarEmpleado(Empleado empleado);
    public Empleado modificarEmpleado(Empleado empleado);
    public String eliminarEmpleado(Integer id);


    public List<Empleado> listar(Empleado c);


}
