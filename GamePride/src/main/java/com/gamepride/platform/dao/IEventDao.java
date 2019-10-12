package com.gamepride.platform.dao;

import java.util.List;

import com.gamepride.platform.entity.Event;

public interface IEventDao {
	public void insertar(Event event);
	
	public List<Event> listar();

	void eliminar(int idEvent);
}
