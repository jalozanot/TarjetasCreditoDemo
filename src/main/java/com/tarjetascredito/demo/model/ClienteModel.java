package com.tarjetascredito.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="cedula")
	private String cedula;
	@Column(name="apellido")
	private String apellido;
	@Column(name="ocupacion_laboral")
	private String ocupacionLaboral;
	@Column(name="ingresos")
	private float ingresos;
	@Column(name="usuario_creacion")
	private String usuarioCreacion;
	@Column(name="usuario_update")
	private String usuarioUpdate;
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	@Column(name="fecha_update")
	private Date fechaUpdate;
	
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
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getUsuarioUpdate() {
		return usuarioUpdate;
	}
	public void setUsuarioUpdate(String usuarioUpdate) {
		this.usuarioUpdate = usuarioUpdate;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaUpdate() {
		return fechaUpdate;
	}
	public void setFechaUpdate(Date fechaUpdate) {
		this.fechaUpdate = fechaUpdate;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

	
	
	
}
