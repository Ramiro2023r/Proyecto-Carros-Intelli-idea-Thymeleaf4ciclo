package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.Estado;


public interface IEstadoRepo extends JpaRepository<Estado, Integer> {
}
