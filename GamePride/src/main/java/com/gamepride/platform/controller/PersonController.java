package com.gamepride.platform.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gamepride.platform.entity.Person;
import com.gamepride.platform.service.IPersonService;

@Named
@RequestScoped
public class PersonController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IPersonService mService;
	private Person person;
	List<Person>listaPersonas;
	
	@PostConstruct
	public void init()
	{
		this.listaPersonas=new ArrayList<Person>();
		this.person=new Person();
		this.listar();
	}
	
	public String nuevaPerson()
	{
		this.setPerson(person);		
		return "person.xhtml";
	}
	
	public void insertar()
	{
		try
		{
			mService.insertar(person);
			limpiarPerson();
			
			this.listar();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	
	public void listar()
	{
		try {
			listaPersonas=mService.listar();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	
	public void limpiarPerson()
	{
		this.init();
	}

	public IPersonService getmService() {
		return mService;
	}

	public void setmService(IPersonService mService) {
		this.mService = mService;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Person> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(List<Person> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}	
}