package com.tns.techfly.vuelos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.techfly.vuelos.model.Persona;
import com.tns.techfly.vuelos.repository.PersonaRepository;



@Service
public class PersonaService {


	@Autowired
	private PersonaRepository personaRepository;

	public void add(Persona persona ) {
		personaRepository.save(persona);

	}

	public void getByName(long cedula) {
		
		personaRepository.findById(cedula);
	}
	
	public void delete(long cedula) {
		
		personaRepository.deleteById(cedula);
	}
	
	public void update(Persona persona) {
		personaRepository.save(persona);
		
	}
	
	public List<Persona> getAll(){
		List <Persona>res= new ArrayList<Persona>();		
		personaRepository.findAll().forEach(res::add);
		return res;
	}
}
