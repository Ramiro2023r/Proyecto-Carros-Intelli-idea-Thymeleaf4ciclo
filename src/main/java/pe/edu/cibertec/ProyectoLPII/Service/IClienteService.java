package pe.edu.cibertec.ProyectoLPII.Service;



import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Model.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> listarCliente();
    public Cliente obtenerCliente(Integer id);
    public Cliente registrarCliente(Cliente cliente);
    public Cliente modificarCliente(Cliente cliente);
    public String eliminarCliente(Integer id);

    public List<Cliente> listar(Cliente c);


}
