package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Repo.ICarroRepo;
import pe.edu.cibertec.ProyectoLPII.Service.ICarroService;


import java.util.List;

@Service
@AllArgsConstructor
public class CarroServiceImpl implements ICarroService {
    @Autowired
    private ICarroRepo carroRepo;

    public List<Carro> listarCarro() {
        return carroRepo.findAll();
    }

    public Carro obtenerCarro(Integer id) {
        return carroRepo.findById(id).get();
    }

    public Carro registrarCarro(Carro carro) {
        return carroRepo.save(carro);
    }

    public Carro modificarCliente(Carro carro) {
        return carroRepo.save(carro);
    }

    public String eliminarCarro(Integer id) {
        carroRepo.deleteById(id);
        return "Carro eliminado";
    }


    public List<Carro> listarr(Carro c) {
        if ( (c.getModelol()!=null && !c.getModelol().isEmpty()) && (c.getMarcaca()==null)) {
            return carroRepo.findByModelol(c.getModelol());
        } else if ( (c.getMarcaca()!=null ) && (c.getModelol()==null || c.getModelol().isEmpty())) {
            return carroRepo.findByMarcaca(c.getMarcaca());
        }

        return carroRepo.findAll();
    }

}