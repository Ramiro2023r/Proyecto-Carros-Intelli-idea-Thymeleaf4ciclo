package pe.edu.cibertec.ProyectoLPII.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="sexo")
public class Sexo implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "sexo_id")
    private int id;

    @Column(name = "sexo_nombre")
    private String nombre;
}
