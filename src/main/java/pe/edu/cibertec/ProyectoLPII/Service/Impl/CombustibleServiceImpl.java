package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Combustible;
import pe.edu.cibertec.ProyectoLPII.Repo.ICombustibleRepo;
import pe.edu.cibertec.proyecto.service.ICombustibleService;

import java.util.List;

@Service
@AllArgsConstructor
public class CombustibleServiceImpl implements ICombustibleService {
    @Autowired
    private ICombustibleRepo combustibleRepo;

    public List<Combustible> listarCombustibles() {
        return combustibleRepo.findAll();
    }

}
