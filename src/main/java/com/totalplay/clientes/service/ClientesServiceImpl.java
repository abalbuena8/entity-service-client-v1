package com.totalplay.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.clientes.dto.Clientes;

@Service 
public class ClientesServiceImpl implements IClientesService{

	@Autowired
	private ClientesDao clientesDao;
	
	
	@Override
	public List<Clientes> getAll() {
		return clientesDao.getClientes();
	}

	@Override
	public Clientes findById(Integer id) {
		
		return null;
	}

	@Override
	public Clientes updateById(Integer id, Clientes cliente) {
		return clientesDao.updateObj(id, cliente);
	}

	@Override
	public void deleteById(Integer id) {
		clientesDao.deleteObj(id);
	}

	@Override
	public Clientes insertClient(Clientes cliente) {
		return clientesDao.insertObj(cliente);
	}
	
	

}
