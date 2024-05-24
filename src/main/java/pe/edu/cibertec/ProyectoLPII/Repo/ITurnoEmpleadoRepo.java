package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.ProyectoLPII.Model.TurnoEmpleado;


public interface ITurnoEmpleadoRepo extends JpaRepository<TurnoEmpleado, Integer> {
}
