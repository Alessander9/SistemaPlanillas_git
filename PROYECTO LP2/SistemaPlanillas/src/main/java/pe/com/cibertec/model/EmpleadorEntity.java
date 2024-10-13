package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_empleador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadorEntity {

    @Id
    @Column(name = "rucEmpleador", nullable = false)
    private String rucEmpleador;

    @Column(name = "nomEmpleador", nullable = false)
    private String nomEmpleador;
}
