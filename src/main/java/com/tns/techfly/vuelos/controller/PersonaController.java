package com.tns.techfly.vuelos.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.techfly.vuelos.model.Persona;
import com.tns.techfly.vuelos.service.PersonaService;

@RequestMapping("/persona")
@RestController
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@PostMapping("persona/add")
	public void add(@RequestBody Persona persona) {

		personaService.add(persona);

	}

	@RequestMapping("persona/{id}")
	public void get(@PathVariable long cedula) {
		personaService.getByName(cedula);
	}

	@RequestMapping("/Allbook")
	public List<Persona> get() {
		return personaService.getAll();

	}

	@DeleteMapping("/book/{id}")
	public void delete(@PathVariable long cedula) {
		personaService.delete(cedula);
	}
}
