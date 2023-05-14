package com.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.model.Eventos;
import com.eventos.repository.EventosRepository;


@Service
public class EventosServiceImpl implements IEventosService {

	@Autowired
	private EventosRepository eventosRepository;
	
	@Override
	public List<Eventos> listaEventos() {
		return (List<Eventos>) eventosRepository.findAll();
	}

	@Override
	public void guardarEventos(Eventos evento) {
		eventosRepository.save(evento);

	}

	@Override
	public Eventos buscarEventoPorId(Integer id) {
		return eventosRepository.findById(id).orElseGet(null);
	}

	@Override
	public void eliminarEvento(Integer id) {
		eventosRepository.deleteById(id);
	}

}
