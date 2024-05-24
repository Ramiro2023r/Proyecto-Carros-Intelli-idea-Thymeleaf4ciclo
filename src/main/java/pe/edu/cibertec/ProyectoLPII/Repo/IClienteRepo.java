package pe.edu.cibertec.ProyectoLPII.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoLPII.Model.Carro;
import pe.edu.cibertec.ProyectoLPII.Model.Cliente;
import pe.edu.cibertec.ProyectoLPII.Model.Marcaca;

import java.util.List;


public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByEdad(String edad);
}
