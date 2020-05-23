package com.tarjetascredito.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarjetascredito.demo.business.IClienteBusiness;
import com.tarjetascredito.demo.dto.ClienteDTO;
import com.tarjetascredito.demo.dto.ClienteRequest;
import com.tarjetascredito.demo.dto.ClienteResponse;
import com.tarjetascredito.demo.dto.TablaClienteDTO;
import com.tarjetascredito.demo.model.ClienteModel;

@RestController
@RequestMapping(value="/cliente")
@CrossOrigin("*")
public class ClienteController {
	
	
	private IClienteBusiness clienteBusiness;
	
	@Autowired
	public ClienteController(IClienteBusiness clienteBusiness) {
		super();
		this.clienteBusiness = clienteBusiness;
	}

	@GetMapping(value="/consultar/clientes")
	public List<ClienteDTO> findAll() {
		return clienteBusiness.consultarCliente();
		 
	}
	

	@GetMapping(value="/buscar/{id}")
	public ResponseEntity<ClienteResponse> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<ClienteResponse>(clienteBusiness.getClientById(id), HttpStatus.OK);
	}

	@PostMapping(value="/save")
	public ResponseEntity<ClienteResponse> save(@RequestBody ClienteRequest clienteRequest) {
		return new ResponseEntity<ClienteResponse>(clienteBusiness.saveClientTarget(clienteRequest), HttpStatus.OK);
	}
	
	@PostMapping(value="/save-cliente")
	public ResponseEntity<ClienteDTO> saveCliente(@RequestBody ClienteDTO clienteDTO) {
		return new ResponseEntity<ClienteDTO>(clienteBusiness.saveClient(clienteDTO), HttpStatus.OK);
	}
	

	@GetMapping(value="/consultar/mostrar/clientes")
	public List<TablaClienteDTO> mostrarCliente() {
		return clienteBusiness.mostrarClientesTabla();
		 
	}

}
