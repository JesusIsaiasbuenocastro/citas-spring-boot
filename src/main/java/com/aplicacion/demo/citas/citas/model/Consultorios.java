package com.aplicacion.demo.citas.citas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Consultorios")
@Data
public class Consultorios {
	@Id
	int numConsultorio;
	int piso;
}
