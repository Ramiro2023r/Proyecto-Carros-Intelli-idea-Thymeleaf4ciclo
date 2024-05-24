package pe.edu.cibertec.ProyectoLPII.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.*;

import java.util.List;


public interface IMotoRepo extends JpaRepository<Moto, Integer>{
    List<Moto> findByModelom(String modelom);
    List<Moto> findByMarcaMoto(MarcaMoto marcaMoto);
}
