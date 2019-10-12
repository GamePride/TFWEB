package com.gamepride.platform.service;

import java.util.List;

import com.gamepride.platform.entity.Person;

public interface IPersonService {
	public void insertar(Person person);
	
	public List<Person>listar();

	void eliminar(int idPerson);
}