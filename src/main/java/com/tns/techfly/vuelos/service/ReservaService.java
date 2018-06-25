package com.tns.techfly.vuelos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.techfly.vuelos.model.Persona;

@Service
public class ReservaService {
	@Autowired
	private ReservaRepository reservaRepository;
	

	public void add(Reserva IdReserva ) {
		reservaRepository.save(IdReserva);

	}

	public void getByName(long IdReserva) {
		
		reservaRepository.findById(IdReserva);
	}
	
	public void delete(long IdReserva) {
		
		reservaRepository.deleteById(IdReserva);
	}
	
	public void update(Reserva reserva) {
		reservaRepository.save(reserva);
		
	}
	
	public List<Reserva> getAll(){
		List <Reserva>res= new ArrayList<Reserva>();		
		reservaRepository.findAll().forEach(res::add);
		return res;
	}
	
}
