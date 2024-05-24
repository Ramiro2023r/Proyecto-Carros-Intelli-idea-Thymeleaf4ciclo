package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Model.Marca;
import pe.edu.cibertec.ProyectoLPII.Model.Marcaca;

import java.util.List;


public interface ICarroRepo extends JpaRepository<Carro, Integer> {
    List<Carro> findByModelol(String modelol);
    List<Carro> findByMarcaca(Marcaca marcaca);
}
