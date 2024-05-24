package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Usuario;

import pe.edu.cibertec.ProyectoLPII.Repo.IUsuarioRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IUsuarioService;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepo usuarioRepo;

    @Override
    public Optional<Usuario> findByUsername(String username) {
        return usuarioRepo.findByUsername(username);
    }



}
