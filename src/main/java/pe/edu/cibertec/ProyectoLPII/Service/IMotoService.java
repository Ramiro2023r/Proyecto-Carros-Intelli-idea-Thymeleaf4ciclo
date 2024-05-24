package pe.edu.cibertec.ProyectoLPII.Service;


import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Model.Moto;

import java.util.List;

public interface IMotoService {

    public List<Moto> listarMotos();

    public Moto obtenerMoto(Integer id);

    public Moto registrarMoto(Moto moto);

    public Moto modificarMoto(Moto moto);

    public String eliminarMoto(Integer id);

    public List<Moto> listarm(Moto c);
}