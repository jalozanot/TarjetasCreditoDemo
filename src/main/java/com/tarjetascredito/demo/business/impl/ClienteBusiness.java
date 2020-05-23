package com.tarjetascredito.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarjetascredito.demo.business.IClienteBusiness;
import com.tarjetascredito.demo.business.facade.ClienteFacade;
import com.tarjetascredito.demo.dto.ClienteDTO;
import com.tarjetascredito.demo.dto.ClienteRequest;
import com.tarjetascredito.demo.dto.ClienteResponse;
import com.tarjetascredito.demo.dto.TablaClienteDTO;
import com.tarjetascredito.demo.model.ClienteModel;
import com.tarjetascredito.demo.model.InfoTarjetaModel;
import com.tarjetascredito.demo.service.interfaces.IClienteService;
import com.tarjetascredito.demo.service.interfaces.IInfoTarjetaService;


@Service
public class ClienteBusiness implements IClienteBusiness{
	
	
	private IClienteService clienteService;
	private IInfoTarjetaService infoTarjetaService;

	
	@Autowired
	public ClienteBusiness(IClienteService clienteService, IInfoTarjetaService infoTarjetaService) {
		super();
		this.clienteService = clienteService;
		this.infoTarjetaService = infoTarjetaService;
		
	}

	@Override
	public ClienteResponse saveClientTarget(ClienteRequest clienteRequest) {
		
		ClienteFacade clienteFacade = new ClienteFacade();
		ClienteResponse clienteResponse = new ClienteResponse();
		ClienteModel clienteModel = clienteFacade.obtenerClienteModel(clienteRequest.getCliente());
		clienteResponse.setCliente(clienteFacade.obtenerClienteDTO(clienteModel));
		InfoTarjetaModel infoTarjetaModel = infoTarjetaService.save(clienteFacade.obtenerInfoTarjetaModel(clienteRequest.getInformacionTarjeta(), clienteModel.getCedula()));
		clienteResponse.setInformacionTarjeta(clienteFacade.obtenerInfoTarjetaDTO(infoTarjetaModel));
		return clienteResponse;
	}

	@Override
	public ClienteResponse deleteClient(ClienteRequest clienteRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteResponse getClientById(Long id) {
		
		ClienteFacade clienteFacade = new ClienteFacade();
		ClienteResponse clienteResponse = new ClienteResponse();
		
		ClienteModel clienteModel = clienteService.findById(id);
		clienteResponse.setCliente(clienteFacade.obtenerClienteDTO(clienteModel));
		InfoTarjetaModel infoTarjetaModel = infoTarjetaService.findById(id);
		clienteResponse.setInformacionTarjeta(clienteFacade.obtenerInfoTarjetaDTO(infoTarjetaModel));
		
		return clienteResponse;
		
	}

	@Override
	public List<ClienteDTO> consultarCliente() {
		
		ClienteFacade clienteFacade = new ClienteFacade();
		return clienteFacade.obtenerClienteListDTO(clienteService.findAll());
		 
	}

	@Override
	public ClienteDTO saveClient(ClienteDTO clienteDTO) {
		
		ClienteFacade clienteFacade = new ClienteFacade();
		ClienteModel clienteModel = clienteService.save(clienteFacade.obtenerClienteModel(clienteDTO));
		return clienteFacade.obtenerClienteDTO(clienteModel);
		
	}

	@Override
	public List<TablaClienteDTO> mostrarClientesTabla() {
		ClienteFacade clienteFacade = new ClienteFacade();
		List<Object[]> clientesLst = clienteService.consultarClientes();
		return clienteFacade.convertirObjectsToClientTable(clientesLst);
	}
	
}
