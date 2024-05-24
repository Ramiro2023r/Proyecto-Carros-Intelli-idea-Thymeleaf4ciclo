package pe.edu.cibertec.ProyectoLPII.Service;




import pe.edu.cibertec.ProyectoLPII.Model.Carro;

import java.util.List;

public interface ICarroService {
    public List<Carro> listarCarro();
    public Carro obtenerCarro(Integer id);
    public Carro registrarCarro(Carro carro);
    public Carro modificarCliente(Carro carro);
    public String eliminarCarro(Integer id);

    public List<Carro> listarr(Carro c);
}