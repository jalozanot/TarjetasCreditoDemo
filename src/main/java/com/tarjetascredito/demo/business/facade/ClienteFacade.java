package com.tarjetascredito.demo.business.facade;

import java.util.ArrayList;
import java.util.List;

import com.tarjetascredito.demo.dto.ClienteDTO;
import com.tarjetascredito.demo.dto.ClienteResponse;
import com.tarjetascredito.demo.dto.InfoTarjetaDTO;
import com.tarjetascredito.demo.dto.TablaClienteDTO;
import com.tarjetascredito.demo.model.ClienteModel;
import com.tarjetascredito.demo.model.InfoTarjetaModel;

public class ClienteFacade {

	public ClienteModel obtenerClienteModel(ClienteDTO clienteDTO) {

		ClienteModel clienteModel = new ClienteModel();
		clienteModel.setId(clienteDTO.getId());
		clienteModel.setNombre(clienteDTO.getNombre());
		clienteModel.setApellido(clienteDTO.getApellido());
		clienteModel.setOcupacionLaboral(clienteDTO.getOcupacionLaboral());
		clienteModel.setIngresos(clienteDTO.getIngresos());
		clienteModel.setCedula(clienteDTO.getCedula());

		return clienteModel;
	}

	public InfoTarjetaModel obtenerInfoTarjetaModel(InfoTarjetaDTO infoTarjetaDTO, String idCliente) {
		
		InfoTarjetaModel infoTarjetaModel = new InfoTarjetaModel();
		infoTarjetaModel.setId(infoTarjetaDTO.getId());
		infoTarjetaModel.setIdCliente(idCliente);
		infoTarjetaModel.setMontoAprobado(infoTarjetaDTO.getMontoAprobado());
		infoTarjetaModel.setCvv(infoTarjetaDTO.getCvv());
		infoTarjetaModel.setBloqueo(infoTarjetaDTO.isBloqueo());
		infoTarjetaModel.setNumTarjeta(infoTarjetaDTO.getNumTarjeta());
		infoTarjetaModel.setTipoTarjeta(infoTarjetaDTO.getTipoTarjeta());
		
		return infoTarjetaModel;
		
	}

	public ClienteDTO obtenerClienteDTO(ClienteModel clienteModel) {

		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setId(clienteModel.getId());
		clienteDTO.setNombre(clienteModel.getNombre());
		clienteDTO.setApellido(clienteModel.getApellido());
		clienteDTO.setOcupacionLaboral(clienteModel.getOcupacionLaboral());
		clienteDTO.setIngresos(clienteModel.getIngresos());
		clienteDTO.setCedula(clienteModel.getCedula());
		return clienteDTO;
	}
	
	public List<ClienteDTO> obtenerClienteListDTO(List<ClienteModel> clienteModelLst) {

		List<ClienteDTO> clienteDTOLst = new ArrayList<>();
		 
		for(ClienteModel clienteModel: clienteModelLst) {
		
			ClienteDTO clienteDTO = new ClienteDTO();
			clienteDTO.setId(clienteModel.getId());
			clienteDTO.setNombre(clienteModel.getNombre());
			clienteDTO.setApellido(clienteModel.getApellido());
			clienteDTO.setOcupacionLaboral(clienteModel.getOcupacionLaboral());
			clienteDTO.setIngresos(clienteModel.getIngresos());
			clienteDTO.setCedula(clienteModel.getCedula());
			
			clienteDTOLst.add(clienteDTO);
		}
		
		return clienteDTOLst;
	}

	public InfoTarjetaDTO obtenerInfoTarjetaDTO(InfoTarjetaModel infoTarjetaModel) {
		
		InfoTarjetaDTO infoTarjetaDTO = new InfoTarjetaDTO();
		infoTarjetaDTO.setId(infoTarjetaModel.getId());
		infoTarjetaDTO.setMontoAprobado(infoTarjetaModel.getMontoAprobado());
		infoTarjetaDTO.setCvv(infoTarjetaModel.getCvv());
		infoTarjetaDTO.setBloqueo(infoTarjetaModel.isBloqueo());
		infoTarjetaDTO.setNumTarjeta(infoTarjetaModel.getNumTarjeta());
		infoTarjetaDTO.setTipoTarjeta(infoTarjetaModel.getTipoTarjeta());
		return infoTarjetaDTO;
		
	}

	public List<ClienteResponse> convertirObjectsToClientResp(List<Object[]> queryRs) {

		List<ClienteResponse> clienteList = new ArrayList<>();
		int i = 0;
		for (Object[] arr : queryRs) {
			clienteList.add(this.convertirArregloAObjeto(arr));
		}

		return clienteList;

	}

	public ClienteResponse convertirArregloAObjeto(Object[] query) {

		ClienteResponse clienteResponse = new ClienteResponse();
		ClienteDTO clienteDTO = new ClienteDTO();
		InfoTarjetaDTO infoTarjetaDTO = new InfoTarjetaDTO();
		System.out.println(query[1]);
		clienteDTO.setId(new Long(query[0].toString()));
		clienteDTO.setNombre(query[1].toString());
		clienteDTO.setApellido(query[2].toString());
		clienteDTO.setOcupacionLaboral(query[3].toString());
		clienteDTO.setIngresos(Float.parseFloat(query[4].toString()));
		clienteDTO.setCedula(query[10].toString());
		clienteResponse.setCliente(clienteDTO);
		
		infoTarjetaDTO.setId(Long.valueOf(query[5].toString()));
		infoTarjetaDTO.setMontoAprobado((Float.parseFloat(query[6].toString())));
		infoTarjetaDTO.setCvv((int) query[7]);
		infoTarjetaDTO.setBloqueo(Boolean.parseBoolean(query[8].toString()));
		infoTarjetaDTO.setNumTarjeta(query[9].toString());
		infoTarjetaDTO.setTipoTarjeta(query[11].toString());
		
		clienteResponse.setInformacionTarjeta(infoTarjetaDTO);

		return clienteResponse;
	}
	
	
	public List<TablaClienteDTO> convertirObjectsToClientTable(List<Object[]> queryRs) {

		List<TablaClienteDTO> clienteList = new ArrayList<>();
		int i = 0;
		for (Object[] arr : queryRs) {
			clienteList.add(this.convertirArregloAObjetoTable(arr));
		}

		return clienteList;

	}
	
	public TablaClienteDTO convertirArregloAObjetoTable(Object[] query) {

		TablaClienteDTO tablaClienteDTO = new TablaClienteDTO();
		
		tablaClienteDTO.setId(new Long(query[0].toString()));
		tablaClienteDTO.setNombre(query[1].toString());
		tablaClienteDTO.setApellido(query[2].toString());
		tablaClienteDTO.setOcupacionLaboral(query[3].toString());
		tablaClienteDTO.setIngresos(Float.parseFloat(query[4].toString()));
		tablaClienteDTO.setIdTarjeta(Long.valueOf(query[5].toString()));
		tablaClienteDTO.setIdCliente(new Long(query[0].toString()));
		tablaClienteDTO.setMontoAprobado((Float.parseFloat(query[6].toString())));
		tablaClienteDTO.setCvv((int) query[7]);
		tablaClienteDTO.setBloqueo(Boolean.parseBoolean(query[8].toString()));
		tablaClienteDTO.setNumTarjeta(query[9].toString());
		tablaClienteDTO.setCedula(query[10].toString());
		tablaClienteDTO.setTipoTarjeta(query[11].toString());

		return tablaClienteDTO;
	}

}
