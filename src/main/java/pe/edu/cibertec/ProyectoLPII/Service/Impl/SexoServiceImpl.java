package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Sexo;
import pe.edu.cibertec.ProyectoLPII.Repo.ISexoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.ISexoService;


import java.util.List;

@Service
@AllArgsConstructor
public class SexoServiceImpl implements ISexoService {
    @Autowired
    private ISexoRepo sexoRepo;

    public List<Sexo> listarSexo() {
        return sexoRepo.findAll();
    }

}
