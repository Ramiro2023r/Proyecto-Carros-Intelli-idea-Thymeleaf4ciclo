package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.RolEmpleado;
import pe.edu.cibertec.ProyectoLPII.Repo.IRolEmpleadoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IRolEmpleadoService;


import java.util.List;

@Service
@AllArgsConstructor
public class RolEmpleadoServiceImpl implements IRolEmpleadoService {
    @Autowired
    private IRolEmpleadoRepo rolEmpleadoRepo;

    public List<RolEmpleado> listarRolEmpleado() {
        return rolEmpleadoRepo.findAll();
    }



}