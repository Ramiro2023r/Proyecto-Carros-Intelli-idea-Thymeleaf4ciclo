package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Estado;
import pe.edu.cibertec.ProyectoLPII.Repo.IEstadoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IEstadoService;


import java.util.List;

@Service
@AllArgsConstructor
public class EstadoServiceImpl implements IEstadoService {
    @Autowired
    private IEstadoRepo estadoRepo;

    public List<Estado> listarEstados() { return estadoRepo.findAll(); }

}
