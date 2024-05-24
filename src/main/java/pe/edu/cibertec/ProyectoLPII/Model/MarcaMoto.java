package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table(name="marcamoto")
public class MarcaMoto implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "marcamoto_id")
    private int id;

    @Column(name = "marca_nombre")
    private String nombre;
}
