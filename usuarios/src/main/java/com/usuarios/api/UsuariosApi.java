package com.usuarios.api;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.dto.Usuario;
import com.usuarios.service.UsuarioService;

@RestController
public class UsuariosApi {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value="/getUsuarios", method=RequestMethod.GET)
	public List<Usuario> getAll(){
	    return usuarioService.getAll();
	}
	
	@RequestMapping(value="/getUsuario", method=RequestMethod.GET)
	public Optional<Usuario> getById(@RequestParam(value = "id") Integer id){
	    return usuarioService.getById(id);
	}
	
	@RequestMapping(value="/addUsuario", method=RequestMethod.POST)
	public Usuario updateOrSave(@RequestBody Usuario usuario){
	    return usuarioService.save(usuario);
	}
	
	@RequestMapping(value="/deleteUsuario", method=RequestMethod.DELETE)
	public void delete(Integer id){
		usuarioService.delete(id);
		System.out.println("Usuario eliminado");
	}
	
	@RequestMapping(value="/updateUsuario", method=RequestMethod.PUT)
	public Usuario updateUsuario(@RequestBody Usuario usuario){
	    return usuarioService.save(usuario);
	}
}
