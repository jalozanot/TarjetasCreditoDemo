package com.tarjetascredito.demo.dto;

public class ClienteResponse {
	
	private ClienteDTO cliente;
	private InfoTarjetaDTO informacionTarjeta;
	
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	
	public InfoTarjetaDTO getInformacionTarjeta() {
		return informacionTarjeta;
	}
	public void setInformacionTarjeta(InfoTarjetaDTO informacionTarjeta) {
		this.informacionTarjeta = informacionTarjeta;
	}
	
	
	
}
