package com.eventos.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventos.model.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository <Usuarios,Integer > {
	

}
