package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_detalle_horario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleHorarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codHorario;

    @Column(name = "nomHorario", nullable = false)
    private String nomHorario;

    @Column(name = "horaInicio", nullable = false)
    private String horaInicio;

    @Column(name = "horaFin", nullable = false)
    private String horaFin;
}


