package com.gamepride.platform.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gamepride.platform.dao.IUserDao;
import com.gamepride.platform.entity.User1;
import com.gamepride.platform.service.IUserService;

@Named
@RequestScoped
public class UserServiceImpl implements IUserService,Serializable {

	private static final long serialVersionUID=1L;
	@Inject
	private IUserDao uD;
	
	@Override
	public void insertar(User1 user) {
		uD.insertar(user);
	}
	
	@Override
	public List<User1> listar(){
		return uD.listar();
	}
	
	@Override
	public void eliminar(int idUser) {
		uD.eliminar(idUser);
	}
}
