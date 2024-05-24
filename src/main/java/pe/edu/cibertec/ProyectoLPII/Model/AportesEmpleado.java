package pe.edu.cibertec.ProyectoLPII.Model;



import jakarta.persistence.*;

import lombok.Data;



import java.io.Serializable;



@Data

@Entity

@Table(name="aportesEmpleado")
public class AportesEmpleado implements Serializable {


    @Id

    @GeneratedValue

    @Column(name = "aportesEmpleado_id")

    private int id;



    @Column(name = "aportesEmpleado_nombre")

    private String nombre;
}
