package com.totalplay.clientes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.totalplay.clientes.dto.Clientes;

@Service
public class ClientesDao {
	
	private List<Clientes> clientes;
	
	public ClientesDao() {
		super();
		clientes = new ArrayList<Clientes>();
		clientes.add(newObj(1,"Adriana Balbuena", "vidals.a8@gmail.com"));
		clientes.add(newObj(2,"Christopher Luvian", "aviation245@gmail.com"));
		this.clientes = clientes;
	}

	public List<Clientes> getClientes(){
		return this.clientes;
	}
	
	private Clientes newObj(Integer id, String nombre, String correo){
		Clientes cliente = new Clientes();
		cliente.setId(id);
		cliente.setNombre(nombre);
		cliente.setCorreo(correo);
		return cliente;
	}
	
	public Clientes insertObj(Clientes cliente){
		Clientes clienteDao = new Clientes();
		clienteDao.setId(cliente.getId());
		clienteDao.setNombre(cliente.getNombre());
		clienteDao.setCorreo(cliente.getCorreo());
		this.clientes.add(clienteDao);
		return clienteDao;
	}
	
	public Clientes updateObj (Integer id, Clientes cliente){
		Optional<Clientes> clienteUpdate = this.clientes.stream()
        .filter(c -> id.equals(c.getId()))
        .findFirst();
	
		clienteUpdate.get().setNombre(cliente.getNombre());
		clienteUpdate.get().setCorreo(cliente.getCorreo());
		return clienteUpdate.get();
	}
	
	public void deleteObj (Integer id){
		Optional<Clientes> clienteUpdate = this.clientes.stream()
        .filter(c -> id.equals(c.getId()))
        .findFirst();
	    this.clientes.remove(clienteUpdate.get());
	    
	}
	
	

}
