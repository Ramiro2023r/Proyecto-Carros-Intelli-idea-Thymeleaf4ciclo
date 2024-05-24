package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Model.Marca;


import java.util.List;

public interface ICamionetaRepo extends JpaRepository<Camioneta, Integer> {
    List<Camioneta> findByModelo(String modelo);
    List<Camioneta> findByMarca(Marca marca);
}
