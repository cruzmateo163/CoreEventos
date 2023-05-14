package com.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.model.Usuarios;
import com.eventos.repository.UsuariosRepository;

@Service
public class UsuariosServiceImpl implements IUsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Override
	public List<Usuarios> listaUser() {
		return (List<Usuarios>) usuariosRepository.findAll();
	}

	@Override
	public void guardarUser(Usuarios usuario) {
		usuariosRepository.save(usuario);
	}

	@Override
	public Usuarios buscarUserPorId(Integer id) {
		return usuariosRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminarUser(Integer id) {
		usuariosRepository.deleteById(id);

	}

}
