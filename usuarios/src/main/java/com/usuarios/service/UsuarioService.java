package com.usuarios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuarios.dao.UsuarioRepository;
import com.usuarios.dto.Usuario;

@Service
public class UsuarioService {

	 @Autowired
	 UsuarioRepository dao;
	 
	 public Usuario save(Usuario usuario){
	        return dao.saveAndFlush(usuario);
	 }
	 
	 public List<Usuario> getAll(){
	        return dao.findAll();
	 }
	 
	 
	public Optional<Usuario> getById(Integer id){
	        return dao.findById(id);
	 }
	 
	 public void delete(Integer id){
	         dao.deleteById(id);
	 }
}
