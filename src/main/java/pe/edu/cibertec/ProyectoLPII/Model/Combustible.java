package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="combustible")
public class Combustible implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "combustible_id")
    private int id;

    @Column(name = "combustible_nombre")
    private String nombre;
}
