package com.gamepride.platform.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Event implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false,length=40)
	private String name;
	
	@Column(name="game",nullable=false,length=50)
	private String game;
	
	@Column(name="startedAt",nullable=false)
	private Calendar startedAt;
	
	@Column(name="vacancy",nullable=false)
	private int vacancy;
	
	@Column(name="costInscription",nullable=false)
	private int costInscription;
	
	@Column(name="reward",nullable=false,length=40)
	private String reward;
	
	
	
	

}
