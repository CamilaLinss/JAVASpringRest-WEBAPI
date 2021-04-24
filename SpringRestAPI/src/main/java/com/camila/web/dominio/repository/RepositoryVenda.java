package com.camila.web.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camila.web.dominio.models.Venda;


@Repository
public interface RepositoryVenda extends JpaRepository<Venda, Long> {

}
