package com.tarjetascredito.demo.service.interfaces;

import java.util.List;

import com.tarjetascredito.demo.model.ClienteModel;



public interface IClienteService{
	
	public List<ClienteModel> findAll();
	public ClienteModel findById(Long id);
	public ClienteModel save(ClienteModel entity);
	public List<Object[]> consultarClientes();
	
}
