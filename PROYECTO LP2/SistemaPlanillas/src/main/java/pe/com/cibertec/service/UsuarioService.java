package pe.com.cibertec.service;
import java.util.List;
import pe.com.cibertec.model.UsuarioEntity;

public interface UsuarioService {

	List<UsuarioEntity>buscarTodosUsuarios();
	UsuarioEntity buscarUsuarioPorId(Integer id);
	void crearUsuario(UsuarioEntity usuarioEntity);
	void actualizarUsuario(Integer id, UsuarioEntity usuarioEntity);
	void eliminarUsuario(Integer id);
	
	
}
