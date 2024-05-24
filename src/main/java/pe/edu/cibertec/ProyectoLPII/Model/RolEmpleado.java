package pe.edu.cibertec.ProyectoLPII.Model;


import jakarta.persistence.*;

import lombok.Data;



import java.io.Serializable;



@Data

@Entity

@Table(name="rolEmpleado")

public class RolEmpleado implements Serializable {

    @Id

    @GeneratedValue

    @Column(name = "rolEmpleado_id")

    private int id;



    @Column(name = "rolEmpleado_nombre")

    private String nombre;

}

