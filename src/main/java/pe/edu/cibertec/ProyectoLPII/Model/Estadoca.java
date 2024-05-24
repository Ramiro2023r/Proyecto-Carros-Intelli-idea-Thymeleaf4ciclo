package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="estadoca")
public class Estadoca implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "estadoca_id")
    private int id;

    @Column(name = "estadoca_nombre")
    private String nombre;
}
