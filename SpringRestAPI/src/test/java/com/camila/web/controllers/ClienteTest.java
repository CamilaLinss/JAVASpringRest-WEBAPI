package com.camila.web.controllers;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.camila.web.DTO.out.cliente.clienteOutputDTO;
import com.camila.web.api.controllers.ClienteController;
import com.camila.web.dominio.models.Cliente;
import com.camila.web.dominio.services.ClienteService;

import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

//Tras todos os metodos dessa classe,assim não precisa declarar RestAssuredMockMvc.metodo toda vez, assim declarando apenas metodo
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.mockito.Mockito.when;


@WebMvcTest
public class ClienteTest {

	
	@Autowired
	private ClienteController clienteControl;
	
	
	@MockBean
	private ClienteService clienteService;
	
	
	@MockBean
	private ModelMapper mapper;
	
	
	
	//AQUI VOU DIZER PARA QUE ELE SÓ TESTE O CLIENTECONTROLLER INJETADO
	//ASSIM evitando que ele teste fazer esse teste em todos os controllers
	@BeforeEach
	public void setup() {
		
		//Com a implementação do import static ele pode ficar mais simples
		//RestAssuredMockMvc.standaloneSetup(this.clienteControl);
		
		standaloneSetup(this.clienteControl);
		
	}
	
	
	
	
	@Test
	public void retorna200OK_solicitarLista() {
		
		//IMPLEMENTO MEU MOCK // Esse mock não é o spring mock - mas do mockito(dependencia para fazer contextos fakes)
		when(this.clienteService.lista())
			.thenReturn((List<Cliente>) new Cliente());
		//Quando o clienteService chamar o metodo list, ele deve retornar uma lista clientes
		//Dessa forma eu controlo em tempo real o que o service do teste tem que fazer e retornar
		
		
		
		
		
		//Como qualquer classe devemos dar o nome e depois o metodo desejado, para acabar com isso
		//Podemos trazer seus metodos de forma static, trocando o import, import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
		given()
		 .accept(ContentType.JSON)
		.when()
			.get("/clientes")
		.then()
			.statusCode(HttpStatus.OK.value());	
		
		// given - o que vamos receber
		// when - get seria o verbo http - Quando for utilizado o endpoint /clientes
		//then - O resultado deve ser o status 200
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
