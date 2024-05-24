package pe.edu.cibertec.ProyectoLPII.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    // Método para validar usuario
    public Optional<Usuario> findByUsername(String username);
}
