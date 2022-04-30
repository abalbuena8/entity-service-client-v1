package com.totalplay.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.clientes.dto.Clientes;
import com.totalplay.clientes.service.IClientesService;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {

	
	@Autowired
	private IClientesService ClientesServiceImpl;
	
	
	@GetMapping("/getAll")
	public List<Clientes> getAll(Clientes cliente) {
		return  ClientesServiceImpl.getAll();
	}
	
	@PostMapping("/insertCliente")
	public Clientes insertCliente(@RequestBody Clientes dto) {
		return ClientesServiceImpl.insertClient(dto);
	}
	
	@PutMapping("/updateCliente/{id}")
	public Clientes updateCliente(@RequestBody Clientes dto,  @PathVariable Integer id) {
		return ClientesServiceImpl.updateById(id, dto);
	}
	
	@DeleteMapping("/deleteCliente/{id}")
	public void deleteCliente(@PathVariable Integer id) {
		ClientesServiceImpl.deleteById(id);
	}

}
