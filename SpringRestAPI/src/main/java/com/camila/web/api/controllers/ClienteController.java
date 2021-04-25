package com.camila.web.api.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.camila.web.DTO.inp.cliente.clienteInputDTO;
import com.camila.web.DTO.out.cliente.clienteOutputDTO;
import com.camila.web.dominio.models.Cliente;
import com.camila.web.dominio.services.ClienteService;



@RestController


@RequestMapping("/clientes")
public class ClienteController {

	
	
	@Autowired
	private ClienteService clienteService;
	
	
	@Autowired
	private ModelMapper mapper;
	
	
	
	
	//METODOS DE CONVERSÃO DO MAPPER - DTO - OUTPUT - esse metodo vai usar o output de base pois o input precisa de uma conversão diferente
	private clienteOutputDTO toModelOut (Cliente cliente) {
		
		return mapper.map(cliente, clienteOutputDTO.class);
		
	}
	
	
	
	
	//LISTA - METODOS DE CONVERSÃO DO MAPPER - DTO - OUTPUT
	private List<clienteOutputDTO> collectionModel (List<Cliente> clientes) {
		
//Tipo de loop que vai ir em cada item e fazer conversão de cada entidade da lista, retornando uma lista convertida
		return clientes.stream()
				.map(Cliente -> toModelOut(Cliente))
				.collect(Collectors.toList());
		
	}
	//OBS: Apenas o output vai ter conversão de lista, porque é apenas na saida de dados que expomos uma lista
	
	
	
	
	//METODOS DE CONVERSÃO DO MAPPER - DTO - INPUT
	//Aqui vamos receber um clienteInputDTOe precisamos converter em json(ou qualquer formato aceito) novamente para manipular
	//Contrario do metodo de output
	private Cliente toEntity (clienteInputDTO clienteInput) {
		
		return mapper.map(clienteInput, Cliente.class);
		
	}
	
	
	
	
	
	
	
	@GetMapping
	public List<clienteOutputDTO> clientes (){
		
		return collectionModel (clienteService.lista());
		
		
	} 
	
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public clienteOutputDTO cadastrar(@RequestBody clienteInputDTO clienteInp) {
		
		//Converte em entidade cliente novamente para que nosso service consiga usar
		Cliente cliente = toEntity(clienteInp);
		
		//Apos receber o resultado convertemos de volta para o output
		return toModelOut(clienteService.cadastrar(cliente));
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
