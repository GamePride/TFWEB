package com.gamepride.platform.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.gamepride.platform.dao.IEventDao;
import com.gamepride.platform.entity.Event;

public class EventDaoImpl implements IEventDao,Serializable {
	private static final long serialVersionUID =1L;
	
	@PersistenceContext(unitName="GamePridePU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Event event) {
		try {
			em.persist(event);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Event> listar() {
		List<Event>lista=new ArrayList <Event>();
		try {
			Query q=em.createQuery("select e from Event e");
			lista=(List<Event>)q.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idEvent) {
		Event eve= new Event();
		try {
			eve=em.getReference(Event.class, idEvent);
			em.remove(eve);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}