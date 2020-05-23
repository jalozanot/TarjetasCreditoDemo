package com.tarjetascredito.demo.business;

import java.util.List;

import com.tarjetascredito.demo.dto.ClienteDTO;
import com.tarjetascredito.demo.dto.ClienteRequest;
import com.tarjetascredito.demo.dto.ClienteResponse;
import com.tarjetascredito.demo.dto.TablaClienteDTO;

public interface IClienteBusiness {

	public ClienteDTO saveClient(ClienteDTO clienteDTO);
	public ClienteResponse saveClientTarget(ClienteRequest clienteRequest);
	public ClienteResponse deleteClient(ClienteRequest clienteRequest);
	public ClienteResponse getClientById(Long id);
	public List<ClienteDTO> consultarCliente();
	public List<TablaClienteDTO> mostrarClientesTabla();
	
	
}
