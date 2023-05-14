package com.eventos.service;

import java.util.List;

import com.eventos.model.Usuarios;

public interface IUsuariosService {

	public List<Usuarios> listaUser();
	public void guardarUser(Usuarios usuario);
	public Usuarios buscarUserPorId(Integer id);
	public void eliminarUser(Integer id);
	
}
