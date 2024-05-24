package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.AportesEmpleado;
import pe.edu.cibertec.ProyectoLPII.Repo.IAportesEmpleadoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IAportesEmpleadoService;


import java.util.List;

@Service
@AllArgsConstructor
public class AportesEmpleadoServiceImpl implements IAportesEmpleadoService {
    @Autowired
    private IAportesEmpleadoRepo aportesEmpleadoRepo;

    public List<AportesEmpleado> listarAportesEmpleado() {
        return aportesEmpleadoRepo.findAll();
    }



}