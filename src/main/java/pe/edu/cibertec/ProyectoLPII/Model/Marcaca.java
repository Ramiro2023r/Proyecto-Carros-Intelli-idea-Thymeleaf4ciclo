package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="marcaca")
public class Marcaca implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "marcaca_id")
    private int id;

    @Column(name = "marcaca_nombre")
    private String nombre;
}
