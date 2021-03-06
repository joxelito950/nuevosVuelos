package com.tns.techfly.vuelos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tns.techfly.vuelos.exception.ResourceNotFoundException;
import com.tns.techfly.vuelos.model.Vuelo;
import com.tns.techfly.vuelos.repository.VueloRepository;

@Service

public class VueloService {
	@Autowired
	private VueloRepository vueloRepository;
	

	public List<Vuelo> getAllVuelos(){
		return vueloRepository.findAll();
	}

	public Vuelo createVuelo(Vuelo vuelo) {
		return vueloRepository.save(vuelo);
	}
	
	public Optional<Vuelo> getVueloById(long idvuelo) {
		return vueloRepository.findById(idvuelo);
	}
	
	public Vuelo updateVuelo(long idvuelo, Vuelo vueloDetails){
		Vuelo vuelo = vueloRepository.findById(idvuelo).orElseThrow(() -> new ResourceNotFoundException("Vuelo", "idvuelo", idvuelo));
		vuelo.nuevaFechaSalida(vueloDetails.getFechaSalida());
		Vuelo updateVuelo = vueloRepository.save(vuelo);
		return updateVuelo;
	}
	
	public ResponseEntity<?> deleteVuelo(long idvuelo){
		Vuelo vuelo=vueloRepository.findById(idvuelo).orElseThrow(() -> new ResourceNotFoundException("vuelo","idvuuelo",idvuelo));
		vueloRepository.delete(vuelo);
		return ResponseEntity.ok().build();
	}
}
