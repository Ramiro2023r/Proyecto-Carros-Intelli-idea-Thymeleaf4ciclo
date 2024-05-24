package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Table(name="empleado")
public class Empleado implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "empleado_id")
    private int id;

    @Column(name = "empleado_nombreEmpleado")
    @NotEmpty
    @Pattern(regexp="[a-zA-Z]{2,20}")
    private String nombreEmpleado;

    @Column(name = "empleado_apellidoPaternoEmpleado")
    @NotEmpty
    private String apellidoPaternoEmpleado;

    @Column(name = "empleado_apellidoMaternoEmpleado")
    @NotEmpty
    private String apellidoMaternoEmpleado;

    @Column(name = "empleado_direccionEmpleado")
    @NotEmpty
    private String direccionEmpleado;

    @Column(name = "empleado_telefono")
    @NotEmpty
    @Pattern(regexp="[0-9]{9}")
    private String telefono;



    @Column(name = "empleado_fechana")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fechana;

    @Column(name = "empleado_fechain")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fechain;



    @Column(name = "empleado_email")
    @NotEmpty
    @Email
    private String email;

    @Column(name = "empleado_puesto")
    @NotEmpty
    private String puesto;

    @Column(name = "empleado_nrobanco")
    @NotEmpty
    private String nrobanco;

    @Column(name = "empleado_salario")
    @NotEmpty
    private String salario;



    @ManyToOne

    @JoinColumn(name="turnoEmpleado_id", nullable = false)
    @NotNull

    private TurnoEmpleado turnoEmpleado;

    @ManyToOne

    @JoinColumn(name="rolEmpleado_id", nullable = false)
    @NotNull

    private RolEmpleado rolEmpleado;


    @ManyToOne

    @JoinColumn(name="aportesEmpleado_id", nullable = false)
    @NotNull

    private AportesEmpleado aportesEmpleado;



}
