package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_contrato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codContrato;

    @Column(name = "idTrabajador", nullable = false)
    private Integer idTrabajador;  // Esto es una clave foránea

    @Column(name = "rucEmpleador", nullable = false)
    private String rucEmpleador;

    @Column(name = "codHorario", nullable = false)
    private Integer codHorario;

    @Column(name = "IdModalidad", nullable = false)
    private Integer IdModalidad;

    @Column(name = "cargo", nullable = false)
    private String cargo;

    @Column(name = "sisPension", nullable = false)
    private String sisPension;

    @Column(name = "fechaInicio", nullable = false)
    private String fechaInicio;

    @Column(name = "fechaFin", nullable = true)
    private String fechaFin;

    @Column(name = "remuneracion", nullable = false)
    private Double remuneracion;

    	// GET Y SET
	public Integer getCodContrato() {
		return codContrato;
	}

	public void setCodContrato(Integer codContrato) {
		this.codContrato = codContrato;
	}

	public Integer getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getRucEmpleador() {
		return rucEmpleador;
	}

	public void setRucEmpleador(String rucEmpleador) {
		this.rucEmpleador = rucEmpleador;
	}

	public Integer getCodHorario() {
		return codHorario;
	}

	public void setCodHorario(Integer codHorario) {
		this.codHorario = codHorario;
	}

	public Integer getIdModalidad() {
		return IdModalidad;
	}

	public void setIdModalidad(Integer idModalidad) {
		IdModalidad = idModalidad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSisPension() {
		return sisPension;
	}

	public void setSisPension(String sisPension) {
		this.sisPension = sisPension;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(Double remuneracion) {
		this.remuneracion = remuneracion;
	}
    
    
}
