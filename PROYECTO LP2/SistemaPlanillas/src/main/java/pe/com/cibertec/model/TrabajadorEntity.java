package pe.com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter
@Setter
@AllArgsConstructor //constructor con parametros
@NoArgsConstructor //constructor vacio
@Entity
@Table (name = "tb_trabajador")
public class TrabajadorEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajador")
    private Long idTrabajador;

    @Column(name = "nombres", length = 100, nullable = false)
    private String nombres;

    @Column(name = "num_dcos", length = 20, nullable = false)
    private String numDcos;

    @Column(name = "sexo", length = 1, nullable = false)
    private String sexo;

    @Column(name = "ape_pat", length = 100, nullable = false)
    private String apePat;

    @Column(name = "ape_mat", length = 100, nullable = false)
    private String apeMat;

    @Column(name = "pais", length = 100, nullable = false)
    private String pais;

    @Column(name = "departamento", length = 100, nullable = false)
    private String departamento;

    @Column(name = "ciudad", length = 100, nullable = false)
    private String ciudad;

    @Column(name = "nacionalidad", length = 100, nullable = false)
    private String nacionalidad;

    @Column(name = "domicilio", length = 255, nullable = false)
    private String domicilio;

    @Column(name = "discapacidad", length = 50)
    private String discapacidad;

    @Column(name = "num_rnpd", length = 20)
    private String numRNPD;

    @Column(name = "celular", length = 15)
    private String celular;

    @Column(name = "correo", length = 100, unique = true)
    private String correo;

}