package com.eventos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventos.model.Eventos;

@Repository
public interface EventosRepository extends CrudRepository<Eventos, Integer> {

}
