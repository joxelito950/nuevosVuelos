package com.tns.techfly.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.techfly.vuelos.model.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, String>{

}
