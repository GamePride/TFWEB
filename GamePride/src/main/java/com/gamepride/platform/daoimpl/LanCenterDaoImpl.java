package com.gamepride.platform.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import com.gamepride.platform.dao.ILanCenterDao;

import com.gamepride.platform.entity.LanCenter;



public class LanCenterDaoImpl implements ILanCenterDao,Serializable {
	private static final long serialVersionUID =1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
@Transactional
@Override
	public void insertar(LanCenter lancenter) {
		// TODO Auto-generated method stub
		try {
			em.persist(lancenter);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
@SuppressWarnings("unchecked")
@Override
	public List<LanCenter> listar() {
		List<LanCenter>lista=new ArrayList <LanCenter>();
		try {
			Query q=em.createQuery("select lc from LanCenter lc");
			lista=(List<LanCenter>)q.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return lista;
	}


}
