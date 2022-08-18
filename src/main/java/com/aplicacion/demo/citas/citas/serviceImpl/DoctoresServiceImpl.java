package com.aplicacion.demo.citas.citas.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.demo.citas.citas.model.Doctor;
import com.aplicacion.demo.citas.citas.repository.DoctorRepository;
import com.aplicacion.demo.citas.citas.service.DoctoresService;

@Service
public class DoctoresServiceImpl implements DoctoresService{
	
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public List<Doctor> obtenerDoctores() {
		
		 List<Doctor>  doctores = doctorRepository.findAll();
		
		return doctores;
	}

}
