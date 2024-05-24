package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Repo.ICamionetaRepo;
import pe.edu.cibertec.ProyectoLPII.Service.ICamionetaService;

import java.util.List;

@Service
@AllArgsConstructor
public class CamionetaServiceImpl implements ICamionetaService {
    @Autowired
    private ICamionetaRepo camionetaRepo;

    public List<Camioneta> listarCamionetas() {
        return camionetaRepo.findAll();
    }

    public Camioneta obtenerCamioneta(Integer id) {
        return camionetaRepo.findById(id).get();
    }

    public Camioneta registrarCamioneta(Camioneta camioneta) {
        return camionetaRepo.save(camioneta);
    }

    public Camioneta modificarCamioneta(Camioneta camioneta) {
        return camionetaRepo.save(camioneta);
    }

    public String eliminarCamioneta(Integer id) {
        camionetaRepo.deleteById(id);
        return "Camioneta eliminada";
    }
    public List<Camioneta> listar(Camioneta c) {
        if ( (c.getModelo()!=null && !c.getModelo().isEmpty()) && (c.getMarca()==null)) {
            return camionetaRepo.findByModelo(c.getModelo());
        } else if ( (c.getMarca()!=null ) && (c.getModelo()==null || c.getModelo().isEmpty())) {
            return camionetaRepo.findByMarca(c.getMarca());
        }

        return camionetaRepo.findAll();
    }

}
