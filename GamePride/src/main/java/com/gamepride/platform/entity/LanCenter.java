package com.gamepride.platform.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lancenter")
public class LanCenter implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false,length=50)
	private String name;
	
	@Column(name="phone",nullable=false)
	private int phone;
	
	@Column(name="adress",nullable=false,length=60)
	private String adress;
	
	@Column(name="disctrit",nullable=false,length=60)
	private String disctrict;
}
