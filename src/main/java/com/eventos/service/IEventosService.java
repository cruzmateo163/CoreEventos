package com.eventos.service;

import java.util.List;
import com.eventos.model.Eventos;


public interface IEventosService {

	public List<Eventos> listaEventos();
	public void guardarEventos(Eventos evento);
	public Eventos buscarEventoPorId(Integer id);
	public void eliminarEvento(Integer id);
	
}
