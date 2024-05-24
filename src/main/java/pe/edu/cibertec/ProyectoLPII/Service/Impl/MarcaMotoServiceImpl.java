package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.cibertec.ProyectoLPII.Model.MarcaMoto;
import pe.edu.cibertec.ProyectoLPII.Repo.IMarcaMotoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IMarcaMotoService;


import java.util.List;

@Service
@AllArgsConstructor
public class MarcaMotoServiceImpl implements IMarcaMotoService {
    @Autowired
    private IMarcaMotoRepo marcaMotoRepo;

    public List<MarcaMoto> listarMarcasMoto(){
        return marcaMotoRepo.findAll();
    };

}
