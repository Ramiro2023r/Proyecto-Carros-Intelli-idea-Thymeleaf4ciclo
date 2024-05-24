package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.cibertec.ProyectoLPII.Model.TipoMoto;
import pe.edu.cibertec.ProyectoLPII.Repo.ITipoMotoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.ITipoMotoService;


import java.util.List;

@Service
@AllArgsConstructor
public class TipoMotoServiceImpl implements ITipoMotoService {
    @Autowired
    private ITipoMotoRepo tipoMotoRepo;

    public List<TipoMoto> listarTiposMoto(){
      return tipoMotoRepo.findAll();
    };
}
