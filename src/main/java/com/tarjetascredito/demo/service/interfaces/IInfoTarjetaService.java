package com.tarjetascredito.demo.service.interfaces;


import java.util.List;

import com.tarjetascredito.demo.model.InfoTarjetaModel;

public interface IInfoTarjetaService {
	
	public List<InfoTarjetaModel> findAll();
	public InfoTarjetaModel findById(Long id);
	public InfoTarjetaModel save(InfoTarjetaModel entity);
	
}
