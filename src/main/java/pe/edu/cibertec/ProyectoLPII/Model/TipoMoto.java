package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="tipomoto")
public class TipoMoto implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "tipomoto_id")
    private int id;

    @Column(name = "tipomoto_nombre")
    private String nombre;
}

