package com.tarjetascredito.demo.dto;

import java.util.Date;

public class ClienteDTO {

	private Long id;

	private String nombre;

	private String apellido;
	
	private String ocupacionLaboral;
	
	private float ingresos;
	
	private String cedula;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getOcupacionLaboral() {
		return ocupacionLaboral;
	}

	public void setOcupacionLaboral(String ocupacionLaboral) {
		this.ocupacionLaboral = ocupacionLaboral;
	}

	public float getIngresos() {
		return ingresos;
	}

	public void setIngresos(float ingresos) {
		this.ingresos = ingresos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	

}
