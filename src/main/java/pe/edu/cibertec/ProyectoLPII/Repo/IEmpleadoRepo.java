package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Model.Empleado;
import pe.edu.cibertec.ProyectoLPII.Model.Marcaca;
import pe.edu.cibertec.ProyectoLPII.Model.TurnoEmpleado;

import java.util.List;


public interface IEmpleadoRepo extends JpaRepository<Empleado, Integer> {
    List<Empleado> findByNombreEmpleado(String nombreEmpleado);
    List<Empleado> findByTurnoEmpleado(TurnoEmpleado turnoEmpleado);




}
