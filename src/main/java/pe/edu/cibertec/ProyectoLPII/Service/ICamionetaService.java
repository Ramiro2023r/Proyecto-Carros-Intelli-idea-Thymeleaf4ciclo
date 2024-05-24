package pe.edu.cibertec.ProyectoLPII.Service;



import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;

import java.util.List;

public interface ICamionetaService {
    public List<Camioneta> listarCamionetas();
    public Camioneta obtenerCamioneta(Integer id);
    public Camioneta registrarCamioneta(Camioneta camioneta);
    public Camioneta modificarCamioneta(Camioneta camioneta);
    public String eliminarCamioneta(Integer id);

    public List<Camioneta> listar(Camioneta c);
}
