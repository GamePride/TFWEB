package com.gamepride.platform.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gamepride.platform.dao.IEventDao;
import com.gamepride.platform.entity.Event;
import com.gamepride.platform.service.IEventService;

@Named
@RequestScoped
public class EventServiceImpl implements IEventService, Serializable {
	private static final long serialVersionUID=1L;
	@Inject
	private IEventDao eD;
	
	@Override
	public void insertar(Event event) {
		eD.insertar(event);
	}
	
	@Override
	public List<Event> listar(){
		return eD.listar();
	}
	
	@Override
	public void eliminar(int idEvent) {
		eD.eliminar(idEvent);
	}
}