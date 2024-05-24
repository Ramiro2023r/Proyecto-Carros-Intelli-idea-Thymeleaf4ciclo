package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "estado_id")
    private int id;

    @Column(name = "estado_nombre")
    private String nombre;
}
