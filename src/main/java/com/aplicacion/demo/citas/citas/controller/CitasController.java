package com.aplicacion.demo.citas.citas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aplicacion.demo.citas.citas.model.Cita;
import com.aplicacion.demo.citas.citas.service.CitasService;
import com.aplicacion.demo.citas.citas.service.DoctoresService;

@Controller
public class CitasController {
	
	@Autowired
	DoctoresService doctoresService;
	
	@Autowired
	CitasService citasService;
	
	@GetMapping("/")
	public String paginaPricipal(Model model) {
		model.addAttribute("doct",doctoresService.obtenerDoctores());
		return "home";
	} 
	
	
	@PostMapping(value = "/guardarcita")
	public String ejecutaConsulta(@ModelAttribute  Cita cita) {
		//guardar cita
		citasService.guardarCita(cita);
		return "paginas/exito";
	}
}
