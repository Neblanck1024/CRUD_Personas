package com.personas.app.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PERSONA")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(name = "nombre_persona", length = 60)
	private String nombre;
	@Column(name = "apellido_persona", length = 60)
	private String apellido;
	@Column(name = "dni_persona", length = 60)
	private String dni;
	@Column(name = "empleado")
	private boolean empleado;
	
	
	
	public Persona() {
		super();
	}
	
	public Persona(Integer id, String nombre, String apellido, String dni, boolean empleado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.empleado = empleado;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	public boolean isEmpleado() {
		return empleado;
	}
	public void setEmpleado(boolean empleado) {
		this.empleado = empleado;
	}
	
	
}
