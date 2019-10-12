package com.gamepride.platform.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gamepride.platform.dao.ILanCenterDao;
import com.gamepride.platform.entity.LanCenter;
import com.gamepride.platform.service.ILanCenterService;

@Named
@RequestScoped
public class LanCenterServiceImpl implements ILanCenterService,Serializable {
	private static final long serialVersionUID=1L;
	@Inject
	private ILanCenterDao lD;
	
	@Override
	public void insertar(LanCenter lancenter) {
		lD.insertar(lancenter);
	}
	
	@Override
	public List<LanCenter> listar(){
		return lD.listar();
	}
	
	@Override
	public void eliminar(int idLanCenter) {
		lD.eliminar(idLanCenter);
	}
}
