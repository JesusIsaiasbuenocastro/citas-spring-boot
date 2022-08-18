package com.aplicacion.demo.citas.citas.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("doctores")
@Data
public class Doctor {
	
	@Id
	ObjectId _id ;
	int id;
	String nombre;
	String apellidoMaterno;
	String apellidoPaterno;
	String especialidad;
	public Doctor() {
	}
	
}
