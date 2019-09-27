package com.gamepride.platform.dao;

import java.util.List;


import com.gamepride.platform.entity.Person;

public interface IPersonDao {
	public void insertar(Person person);
	public List<Person> listar();
}
