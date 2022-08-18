package com.aplicacion.demo.citas.citas.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.demo.citas.citas.model.Cita;
import com.aplicacion.demo.citas.citas.repository.CitaRepository;
import com.aplicacion.demo.citas.citas.service.CitasService;

@Service
public class CitasServiceImpl implements CitasService {
	
	@Autowired
	CitaRepository citaRepository;
	
	@Override
	public List<Cita> obtenerCitas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarCita(Cita cita) {
		citaRepository.save(cita);
		
	}

}
