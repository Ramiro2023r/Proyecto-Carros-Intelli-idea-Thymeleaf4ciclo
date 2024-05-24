package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Marca;
import pe.edu.cibertec.ProyectoLPII.Repo.IMarcaRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IMarcaService;


import java.util.List;

@Service
@AllArgsConstructor
public class MarcaServiceImpl implements IMarcaService {
    @Autowired
    private IMarcaRepo marcaRepo;

    public List<Marca> listarMarcas() {
        return marcaRepo.findAll();
    }

}
