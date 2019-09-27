package com.gamepride.platform.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import com.gamepride.platform.dao.IPersonDao;

import com.gamepride.platform.entity.Person;



public class PersonDaoImpl implements IPersonDao,Serializable {
	private static final long serialVersionUID =1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
@Transactional
@Override
	public void insertar(Person person) {
		// TODO Auto-generated method stub
		try {
			em.persist(person);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
@SuppressWarnings("unchecked")
@Override
	public List<Person> listar() {
		List<Person>lista=new ArrayList <Person>();
		try {
			Query q=em.createQuery("select p from Person p");
			lista=(List<Person>)q.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return lista;
	}


}
