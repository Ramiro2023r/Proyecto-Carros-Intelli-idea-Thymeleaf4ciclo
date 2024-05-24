package pe.edu.cibertec.ProyectoLPII.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="moto")
public class Moto implements Serializable {
// ID
    @Id
    @GeneratedValue
    @Column(name = "moto_id")
    private int id;

    @Column(name = "moto_modelom")
    @NotEmpty
    private String modelom;

    @Column(name = "moto_precio")
    private double precio;

    @Column(name = "moto_fecFabricacion")
    @NotEmpty
    @Pattern(regexp="[0-9]{4}")
    private String fecFabricacion;

    @Column(name = "moto_octanaje")
    @NotEmpty
    private String octanaje;

    @Column(name = "moto_cilindrada")
    @NotNull
    private double cilindrada;

    @Column(name = "moto_descripcion")
    @NotEmpty
    private String descripcion;

    @Column(name = "moto_fecPublicacion")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fechaPublicacion;

    //    COMBOBOX
    @ManyToOne
    @JoinColumn(name="marcamoto_id", nullable = false)
    @NotNull
    private MarcaMoto marcaMoto;

    @ManyToOne
    @JoinColumn(name="tipomoto_id", nullable = false)
    @NotNull
    private TipoMoto tipoMoto;

}
