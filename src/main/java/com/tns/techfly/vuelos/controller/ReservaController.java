package com.tns.techfly.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.tns.techfly.vuelos.model.Reserva;
import com.tns.techfly.vuelos.service.ReservaService;


@RequestMapping("/reserva")
@RestController
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	
	@GetMapping("/Allreserva")
	public List<Reserva> getAllReservas(){
		return reservaService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@Validated @RequestBody Reserva reserva) {
		reservaService.add(reserva);
	}
	
	@GetMapping("/reserva/{idreserva}")
	public void getReservaById(@PathVariable(value="idreserva")long idReserva){
		 reservaService.getByName(idReserva);
	}
	
	@PutMapping("/reserva/{idreserva}")
	public void updateReserva(@PathVariable(value="idreserva")Reserva reserva) {
		reservaService.update(reserva);
	}
	
	@DeleteMapping("/reserva/{id}")
	public void delete(@PathVariable long idReserva) {
		reservaService.delete(idReserva);
	}
}
