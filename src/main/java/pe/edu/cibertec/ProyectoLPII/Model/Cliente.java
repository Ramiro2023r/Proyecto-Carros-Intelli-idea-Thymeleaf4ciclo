package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name="cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "cliente_id")
    private int id;

    @Column(name = "cliente_nombre")
    @NotEmpty
    @Pattern(regexp="[a-zA-Z]{2,20}")
    private String nombre;

    @Column(name = "cliente_apellidoPaterno")
    @NotEmpty
    private String apellidoPaterno;

    @Column(name = "cliente_apellidoMaterno")
    @NotEmpty
    private String apellidoMaterno;

    @Column(name = "cliente_edad")
    @NotEmpty
    private String edad;
    @Column(name = "cliente_direccion")
    @NotEmpty
    private String direccion;

    @Column(name = "cliente_telefono")
    @NotEmpty
    @Pattern(regexp="[0-9]{9}")
    private String telefono;

    @Column(name = "cliente_email")
    @NotEmpty
    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name="sexo_id", nullable = false)
    @NotNull
    private Sexo sexo;

}
