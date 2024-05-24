package pe.edu.cibertec.ProyectoLPII.Model;



import jakarta.persistence.*;

        import lombok.Data;



        import java.io.Serializable;



@Data

@Entity

@Table(name="turnoEmpleado")

public class TurnoEmpleado implements Serializable {

    @Id

    @GeneratedValue

    @Column(name = "turnoEmpleado_id")

    private int id;



    @Column(name = "turnoEmpleado_nombre")

    private String nombre;

}