package com.gamepride.platform.dao;

import java.util.List;


import com.gamepride.platform.entity.LanCenter;

public interface ILanCenterDao {
	public void insertar(LanCenter lancenter);
	
	public List<LanCenter> listar();

	void eliminar(int idLanCenter);
}
