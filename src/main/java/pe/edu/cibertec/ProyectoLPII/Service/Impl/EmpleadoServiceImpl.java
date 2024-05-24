package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Model.Empleado;
import pe.edu.cibertec.ProyectoLPII.Repo.IEmpleadoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IEmpleadoService;


import java.util.List;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements IEmpleadoService {
    @Autowired
    private IEmpleadoRepo empleadoRepo;

    public List<Empleado> listarEmpleado() {
        return empleadoRepo.findAll();
    }

    public Empleado obtenerEmpleado(Integer id) {
        return empleadoRepo.findById(id).get();
    }

    public Empleado registrarEmpleado(Empleado empleado) {
        return empleadoRepo.save(empleado);
    }

    public Empleado modificarEmpleado(Empleado empleado) {
        return empleadoRepo.save(empleado);
    }

    public String eliminarEmpleado(Integer id) {
        empleadoRepo.deleteById(id);
        return "Empleado Eliminado";
    }



    public List<Empleado> listar(Empleado c) {
        if ( (c.getNombreEmpleado()!=null && !c.getNombreEmpleado().isEmpty()) && (c.getTurnoEmpleado()==null)) {
            return empleadoRepo.findByNombreEmpleado(c.getNombreEmpleado());
        } else if ( (c.getTurnoEmpleado()!=null ) && (c.getNombreEmpleado()==null || c.getNombreEmpleado().isEmpty())) {
            return empleadoRepo.findByTurnoEmpleado(c.getTurnoEmpleado());
        }

        return empleadoRepo.findAll();
    }


}