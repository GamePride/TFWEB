package com.gamepride.platform.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="game")
	public class Game implements Serializable{

		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="name",nullable=false,length=40)
		private char name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public char getName() {
			return name;
		}

		public void setName(char name) {
			this.name = name;
		}
}
