package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Chaise extends Meuble {

	@Column(columnDefinition = "varchar(255) default 'bois' ")
	private String matiere;
	
}
