package com.tarjetascredito.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarjetascredito.demo.model.InfoTarjetaModel;

@Repository
public interface IInfoTarjetaRepository extends CrudRepository<InfoTarjetaModel, Long>{

}
