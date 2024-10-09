package pe.com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.model.UsuarioEntity;
import pe.com.cibertec.repository.UsuarioRepository;
import pe.com.cibertec.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<UsuarioEntity> buscarTodosUsuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public UsuarioEntity buscarUsuarioPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearUsuario(UsuarioEntity usuarioEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(Integer id, UsuarioEntity usuarioEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
