package com.camila.web.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camila.web.dominio.models.Cliente;


@Repository
public interface RepositoryCliente extends JpaRepository<Cliente, Long> {

	
	
}
