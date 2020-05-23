package com.tarjetascredito.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info_tarjeta")
public class InfoTarjetaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="id_cliente")
	private String idCliente;
	@Column(name="monto_aprobado")
	private float montoAprobado;
	@Column(name="cvv")
	private int cvv;
	@Column(name="bloqueo")
	private boolean bloqueo;
	@Column(name="num_tarjeta")
	private String numTarjeta;
	@Column(name="tipo_tarjeta")
	private String tipoTarjeta;
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
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
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
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	
}
