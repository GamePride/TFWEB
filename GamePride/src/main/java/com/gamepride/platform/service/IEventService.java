package com.gamepride.platform.service;

import java.util.List;

import com.gamepride.platform.entity.Event;

public interface IEventService {
	public void insertar(Event event);
	
	public List<Event>listar();

	void eliminar(int idEvent);
}
