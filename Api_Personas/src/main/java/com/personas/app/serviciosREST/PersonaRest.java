package com.personas.app.serviciosREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personas.app.entidades.Persona;
import com.personas.app.repositorio.IPersonaRepo;

@RestController
@RequestMapping("/persona")
public class PersonaRest {
	
	@Autowired
	private IPersonaRepo personaRepo;
	
	@GetMapping("/listar")
	public List<Persona> listar(){
		return personaRepo.findAll();
	}
	@PostMapping("/altaPersona")
	public String guardar(@RequestBody Persona per){
		String respuesta = "";
		Persona p = personaRepo.save(per);
		if(p != null) {
			respuesta = "Se registro correctamente";
		}else {
			respuesta = "Ocurrió un error inesperado";			
		}
		return respuesta;
	}
	@PutMapping("/modificarPersona")
	public String modificar(@RequestBody Persona per){
		String respuesta = "";
		Persona p = personaRepo.save(per);
		if(p != null) {
			respuesta = "Se modificó correctamente";
		}else {
			respuesta = "Ocurrió un error inesperado";			
		}
		return respuesta;
	}
	@DeleteMapping("/bajaPersona/{id}")
	public String eliminar(@PathVariable Integer id){
		
		 if (!personaRepo.existsById(id)) {
			 return "Persona no registrada";
		 }else {
	        personaRepo.deleteById(id);
	        return "Se eliminó correctamente";
		 }
	}
}
