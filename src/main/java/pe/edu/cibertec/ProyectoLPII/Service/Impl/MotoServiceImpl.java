package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pe.edu.cibertec.ProyectoLPII.Model.Moto;
import pe.edu.cibertec.ProyectoLPII.Repo.IMotoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IMotoService;

import java.util.List;

@Service
@AllArgsConstructor
public class MotoServiceImpl implements IMotoService {
    @Autowired
    private IMotoRepo motoRepo;

    public List<Moto> listarMotos()  {
        return motoRepo.findAll();
    }

    public Moto obtenerMoto(Integer id) {

        return motoRepo.findById(id).get();
    }

    public Moto registrarMoto(Moto moto) {

        return motoRepo.save(moto);
    }

    public Moto modificarMoto(Moto moto) {

        return motoRepo.save(moto);
    }

    public String eliminarMoto(Integer id) {
        motoRepo.deleteById(id);
        return "Articulo eliminado";
    }

    public List<Moto> listarm(Moto c) {
        if ( (c.getModelom()!=null && !c.getModelom().isEmpty()) && (c.getMarcaMoto()==null)) {
            return motoRepo.findByModelom(c.getModelom());
        } else if ( (c.getMarcaMoto()!=null ) && (c.getModelom()==null || c.getModelom().isEmpty())) {
            return motoRepo.findByMarcaMoto(c.getMarcaMoto());
        }

        return motoRepo.findAll();
    }

}
