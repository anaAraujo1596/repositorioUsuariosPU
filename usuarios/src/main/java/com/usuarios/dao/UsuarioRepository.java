package com.usuarios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuarios.dto.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
