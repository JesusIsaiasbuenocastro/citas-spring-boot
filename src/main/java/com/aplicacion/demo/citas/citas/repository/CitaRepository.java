package com.aplicacion.demo.citas.citas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion.demo.citas.citas.model.Cita;


@Repository
public interface CitaRepository extends MongoRepository <Cita, String>{

}
