package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name="camioneta")
public class Camioneta implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "camioneta_id")
    private int id;

    @Column(name = "camioneta_modelo")
    @NotEmpty
    private String modelo;

    @Column(name = "camioneta_color")
    @NotEmpty
    @Pattern(regexp="[a-zA-Z]{2,15}")
    private String color;

    @Column(name = "camioneta_motor")
    @NotEmpty
    private String motor;

    @Column(name = "camioneta_precio")
    private double precio;

    @ManyToOne
    @JoinColumn(name="marca_id", nullable = false)
    @NotNull
    private Marca marca;

    @ManyToOne
    @JoinColumn(name="combustible_id", nullable = false)
    @NotNull
    private Combustible combustible;

    @ManyToOne
    @JoinColumn(name="estado_id", nullable = false)
    @NotNull
    private Estado estado;

}