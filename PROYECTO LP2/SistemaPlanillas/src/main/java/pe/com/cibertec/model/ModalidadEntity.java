package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_modalidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModalidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdModalidad;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;
}
