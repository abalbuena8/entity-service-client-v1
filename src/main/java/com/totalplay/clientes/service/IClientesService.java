package com.totalplay.clientes.service;

import java.util.List;

import com.totalplay.clientes.dto.Clientes;

public interface IClientesService {
	
	public List<Clientes> getAll();
	public Clientes findById( Integer id);
	public Clientes updateById(Integer id, Clientes cliente);
	public void deleteById(Integer id);
	public Clientes insertClient(Clientes cliente);
	
	

}
