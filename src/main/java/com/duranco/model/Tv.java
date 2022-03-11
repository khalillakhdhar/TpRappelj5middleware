package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Min;

@Entity
public class Tv extends Electro {

	
	@Column(columnDefinition = "varchar(100) default 'chine' ")
	private String origine;
	
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	
	
}
