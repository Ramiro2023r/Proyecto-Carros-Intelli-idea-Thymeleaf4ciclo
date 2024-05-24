package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Estadoca;
import pe.edu.cibertec.ProyectoLPII.Repo.IEstadocaRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IEstadocaService;


import java.util.List;

@Service
@AllArgsConstructor
public class EstadocaServiceImpl implements IEstadocaService {
    @Autowired
    private IEstadocaRepo estadoRepo;

    public List<Estadoca> listarEstado() { return estadoRepo.findAll(); }

}
