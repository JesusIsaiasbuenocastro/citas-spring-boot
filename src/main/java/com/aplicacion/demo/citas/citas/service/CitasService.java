package com.aplicacion.demo.citas.citas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aplicacion.demo.citas.citas.model.Cita;

public interface CitasService {
	
	List<Cita> obtenerCitas();
	void guardarCita(Cita cita);

}
