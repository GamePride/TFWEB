package com.gamepride.platform.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import com.gamepride.platform.dao.IUserDao;

import com.gamepride.platform.entity.User1;

public class UserDaoImpl implements IUserDao,Serializable {
	private static final long serialVersionUID =1L;
	
	@PersistenceContext(unitName="GamePridePU")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(User1 user) {
		try {
			em.persist(user);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User1> listar() {
		List<User1>lista=new ArrayList <User1>();
		try {
			Query q=em.createQuery("select u from User u");
			lista=(List<User1>)q.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idUser) {
		User1 user= new User1();
		try {
			user=em.getReference(User1.class, idUser);
			em.remove(user);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}