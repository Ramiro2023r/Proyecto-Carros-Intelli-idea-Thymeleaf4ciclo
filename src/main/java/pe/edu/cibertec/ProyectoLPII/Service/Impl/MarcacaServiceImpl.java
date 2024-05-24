package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Marcaca;
import pe.edu.cibertec.ProyectoLPII.Repo.IMarcacaRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IMarcacaService;


import java.util.List;

@Service
@AllArgsConstructor
public class MarcacaServiceImpl implements IMarcacaService {
    @Autowired
    private IMarcacaRepo marcaRepo;

    public List<Marcaca> listarMarca() {
        return marcaRepo.findAll();
    }

}
