package com.tarjetascredito.demo.dto;

import java.util.Date;


public class InfoTarjetaDTO {
	
	
	private Long id;
	
	private int idCliente;
	
	private float montoAprobado;
	
	private int cvv;
	
	private boolean bloqueo;
	
	private String numTarjeta;
	
	private String tipoTarjeta;
	
//	private String usuarioCreacion;
//	
//	private String usuarioUpdate;
//	
//	private Date fechaCreacion;
//	
//	private Date fechaUpdate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public float getMontoAprobado() {
		return montoAprobado;
	}
	public void setMontoAprobado(float montoAprobado) {
		this.montoAprobado = montoAprobado;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public boolean isBloqueo() {
		return bloqueo;
	}
	public void setBloqueo(boolean bloqueo) {
		this.bloqueo = bloqueo;
	}
	public String getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
//	public String getUsuarioCreacion() {
//		return usuarioCreacion;
//	}
//	public void setUsuarioCreacion(String usuarioCreacion) {
//		this.usuarioCreacion = usuarioCreacion;
//	}
//	public String getUsuarioUpdate() {
//		return usuarioUpdate;
//	}
//	public void setUsuarioUpdate(String usuarioUpdate) {
//		this.usuarioUpdate = usuarioUpdate;
//	}
//	public Date getFechaCreacion() {
//		return fechaCreacion;
//	}
//	public void setFechaCreacion(Date fechaCreacion) {
//		this.fechaCreacion = fechaCreacion;
//	}
//	public Date getFechaUpdate() {
//		return fechaUpdate;
//	}
//	public void setFechaUpdate(Date fechaUpdate) {
//		this.fechaUpdate = fechaUpdate;
//	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String typoTarjeta) {
		this.tipoTarjeta = typoTarjeta;
	}
	
}
