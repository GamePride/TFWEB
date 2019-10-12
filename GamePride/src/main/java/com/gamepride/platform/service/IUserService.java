package com.gamepride.platform.service;

import java.util.List;

import com.gamepride.platform.entity.User1;

public interface IUserService {
	public void insertar(User1 user);
	
	public List<User1>listar();
	
	void eliminar(int idUser);
}
