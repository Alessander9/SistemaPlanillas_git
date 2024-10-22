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
@Table (name = "tb_usuario")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioId;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "correo", nullable = false, unique = true)
	private String correo;

	@Column(name = "password", nullable = false)
	private String password;
	
}
