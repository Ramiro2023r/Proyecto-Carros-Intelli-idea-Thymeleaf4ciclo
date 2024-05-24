package pe.edu.cibertec.ProyectoLPII.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name="authority")
public class Authority  implements Serializable {


    @Id
    @GeneratedValue
    private int id;

    @Column
    private String authority;
}
