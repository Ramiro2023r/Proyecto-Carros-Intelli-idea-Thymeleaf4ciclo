package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.Combustible;


public interface ICombustibleRepo extends JpaRepository<Combustible, Integer> {
}
