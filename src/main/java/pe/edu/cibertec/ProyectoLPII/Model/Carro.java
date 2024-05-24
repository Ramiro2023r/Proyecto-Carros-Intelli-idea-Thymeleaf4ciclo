package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name="carro")
public class Carro implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "carro_id")
    private int id;

    @Column(name = "carro_modelol")
    @NotEmpty
    private String modelol;

    @Column(name = "carro_color")
    @NotEmpty
    @Pattern(regexp="[a-zA-Z]{2,15}")
    private String color;

    @Column(name = "carro_motor")
    @NotEmpty
    private String motor;

    @Column(name = "carro_precio")
    private double precio;

    @ManyToOne
    @JoinColumn(name="estadoca_id", nullable = false)
    @NotNull
    private Estadoca estadoca;

    @ManyToOne
    @JoinColumn(name="marcaca_id", nullable = false)
    @NotNull
    private Marcaca marcaca;

}