package com.tarjetascredito.demo.dto;

public class TablaClienteDTO {
	
	
	private Long id;
	private String nombre;
	private String apellido;
	private String ocupacionLaboral;
	private float ingresos;
	private Long idTarjeta;
	private Long idCliente;
	private float montoAprobado;
	private int cvv;
	private boolean bloqueo;
	private String numTarjeta;
	private String cedula;
	private String tipoTarjeta;
	
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
	public Long getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	
	
}
