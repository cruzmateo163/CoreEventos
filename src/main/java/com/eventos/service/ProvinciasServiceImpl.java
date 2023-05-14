package com.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.model.Provincias;
import com.eventos.repository.PaisesRepository;
import com.eventos.repository.ProvinciasRepository;

@Service
public class ProvinciasServiceImpl implements IProvinciasService {

	@Autowired
	private ProvinciasRepository provinciasRepository;
	
	@Override
	public List<Provincias> listaProvincias() {
		
		return (List<Provincias>) provinciasRepository.findAll();
	}

}
