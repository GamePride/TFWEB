package com.gamepride.platform.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gamepride.platform.dao.IPersonDao;
import com.gamepride.platform.entity.Person;
import com.gamepride.platform.service.IPersonService;

@Named
@RequestScoped
public class PersonServiceImpl implements IPersonService,Serializable {

	private static final long serialVersionUID=1L;
	@Inject
	private IPersonDao pD;
	
	@Override
	public void insertar(Person person) {
		pD.insertar(person);
	}
	
	@Override
	public List<Person> listar(){
		return pD.listar();
	}
	
	@Override
	public void eliminar(int idPerson) {
		pD.eliminar(idPerson);
	}
}