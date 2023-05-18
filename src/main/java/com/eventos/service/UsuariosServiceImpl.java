package com.eventos.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.model.Usuarios;
import com.eventos.repository.UsuariosRepository;



@Service
public class UsuariosServiceImpl implements IUsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Autowired
	private SessionFactory sessionFactory;
	
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

	@Override
	public Usuarios validar(String usuario, String clave) {
		
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(
				"Select US "
				+ " from Usuarios US"
				+ " Where US.cedula = : cedula and US.contrasena = : clave"
				,Usuarios.class);
		
		query.setParameter("cedula", usuario);
		query.setParameter("clave", clave);
		System.out.print(query.getSingleResult());
				
		return (Usuarios)query.getSingleResult();
	}

	
	
}
