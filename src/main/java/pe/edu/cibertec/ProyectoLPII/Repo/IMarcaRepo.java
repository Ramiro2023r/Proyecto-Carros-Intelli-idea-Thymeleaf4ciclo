package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.Marca;
;

public interface IMarcaRepo extends JpaRepository<Marca, Integer> {
}
