package pe.edu.cibertec.ProyectoLPII.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.ProyectoLPII.Model.Camioneta;
import pe.edu.cibertec.ProyectoLPII.Model.Cliente;
import pe.edu.cibertec.ProyectoLPII.Repo.IClienteRepo;
import pe.edu.cibertec.ProyectoLPII.Service.IClienteService;


import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteRepo clienteRepo;

    public List<Cliente> listarCliente() {
        return clienteRepo.findAll();
    }

    public Cliente obtenerCliente(Integer id) {
        return clienteRepo.findById(id).get();
    }

    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public Cliente modificarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public String eliminarCliente(Integer id) {
        clienteRepo.deleteById(id);
        return "Cliente eliminada";
    }


    public List<Cliente> listar(Cliente c) {
        if ( (c.getNombre()!=null && !c.getNombre().isEmpty()) && (c.getEdad()==null)) {
            return clienteRepo.findByNombre(c.getNombre());
        } else if ( (c.getEdad()!=null ) && (c.getNombre()==null || c.getNombre().isEmpty())) {
            return clienteRepo.findByEdad(c.getEdad());
        }

        return clienteRepo.findAll();
    }


}
