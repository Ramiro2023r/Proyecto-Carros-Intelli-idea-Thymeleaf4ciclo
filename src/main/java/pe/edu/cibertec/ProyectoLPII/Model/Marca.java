package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="marca")
public class Marca implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "marca_id")
    private int id;

    @Column(name = "marca_nombre")
    private String nombre;
}
