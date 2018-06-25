package com.tns.techfly.vuelos.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.tns.techfly.vuelos.model.Vuelo;
import com.tns.techfly.vuelos.service.VueloService;

@RequestMapping("/pru")
@RestController

public class VueloController {
	@Autowired
	private VueloService vueloService;
	
	@GetMapping("/Allvuelo")
	public List<Vuelo> getAllVuelos(){
		return vueloService.getAllVuelos();
	}
	
	@PostMapping("/vuelo")
	public Vuelo createVuelo(@Validated @RequestBody Vuelo vuelo) {
		return vueloService.createVuelo(vuelo);
	}
	
	@GetMapping("/vuelo/{idvuelo}")
	public Optional<Vuelo> getVueloById(@PathVariable(value="idvuelo")long idvuelo) {
		return vueloService.getVueloById(idvuelo);
	}
	
	@PutMapping("/vuelo/{idvuelo}")
	public Vuelo updateVuelo(@PathVariable(value="idvuelo") long idvuelo, @Valid @RequestBody Vuelo vueloDetails){
		return vueloService.updateVuelo(idvuelo, vueloDetails);
	}
	
	@DeleteMapping("/vuelo/{idvuelo}")
	public ResponseEntity<?> deleteVuelo(@PathVariable(value="idvuelo")long idvuelo){
		return vueloService.deleteVuelo(idvuelo);
	}
}
