package com.gamepride.platform.dao;

import java.util.List;

import com.gamepride.platform.entity.User1;

public interface IUserDao {
	public void insertar(User1 user);
	public List<User1> listar();
}
