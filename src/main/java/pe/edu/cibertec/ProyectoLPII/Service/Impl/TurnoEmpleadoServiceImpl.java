package pe.edu.cibertec.ProyectoLPII.Service.Impl;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.TurnoEmpleado;
import pe.edu.cibertec.ProyectoLPII.Repo.ITurnoEmpleadoRepo;
import pe.edu.cibertec.ProyectoLPII.Service.ITurnoEmpleadoService;

import java.util.List;

@Service
@AllArgsConstructor
public class TurnoEmpleadoServiceImpl  implements ITurnoEmpleadoService {

    @Autowired
    private ITurnoEmpleadoRepo turnoEmpleadoRepo;

    public List<TurnoEmpleado> listarTurnoEmpleado() {
        return turnoEmpleadoRepo.findAll();
    }
}
