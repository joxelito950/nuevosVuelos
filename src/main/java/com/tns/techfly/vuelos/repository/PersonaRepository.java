package com.tns.techfly.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.techfly.vuelos.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
