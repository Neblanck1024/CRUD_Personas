package com.personas.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personas.app.entidades.Persona;
@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
	
}
