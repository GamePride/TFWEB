package com.gamepride.platform.service;

import java.util.List;

import com.gamepride.platform.entity.LanCenter;

public interface ILanCenterService {
	public void insertar(LanCenter lancenter);
	public List<LanCenter>listar();
}
