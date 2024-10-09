package pe.com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.com.cibertec.model.UsuarioEntity;
import pe.com.cibertec.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired	
	private UsuarioService usuarioService;
		
	@GetMapping("/")
	public String home(Model model) {
		List<UsuarioEntity> listaUsuario = usuarioService.buscarTodosUsuarios();
		model.addAttribute("lst_usuario", listaUsuario);
		return "listar_usuario";
	}
}
