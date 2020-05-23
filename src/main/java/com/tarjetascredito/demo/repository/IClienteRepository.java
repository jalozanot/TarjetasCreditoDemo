package com.tarjetascredito.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarjetascredito.demo.model.ClienteModel;



@Repository
public interface IClienteRepository extends CrudRepository<ClienteModel, Long>{
	
	
	@Query(value="select c.id as idcliente, c.nombre, c.apellido, c.ocupacion_laboral, c.ingresos, \r\n" + 
			"	   it.id as idinfotarjeta, it.monto_aprobado, it.cvv, it.bloqueo, it.num_tarjeta, c.cedula, it.tipo_tarjeta from cliente c \r\n" + 
			"inner join info_tarjeta it on(c.cedula = it.id_cliente)",nativeQuery = true)
	List<Object[]> consultarClientes();
	
}
