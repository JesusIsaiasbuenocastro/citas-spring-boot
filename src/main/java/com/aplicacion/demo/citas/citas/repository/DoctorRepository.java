package com.aplicacion.demo.citas.citas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aplicacion.demo.citas.citas.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor,String>{

}
