package com.aplicacion.demo.citas.citas.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("citas")
@Data
public class Cita {
	
	@Id
	int idCita;
	String doctor;
	int idConsultorio;
	LocalDate fecha;
	String nombrePaciente;
	
}
