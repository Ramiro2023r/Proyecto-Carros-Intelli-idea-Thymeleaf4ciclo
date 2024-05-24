package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.Usuario;

import java.util.Optional;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

    // Método personalizado para validar el usuario
    Optional<Usuario> findByUsername(String username);


}
