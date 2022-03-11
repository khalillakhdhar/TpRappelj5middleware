package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Min;

@Entity
public class Tv extends Produit {

	@Min(value = 36)
	private int resolution;
	@Column(columnDefinition = "varchar(100) default 'chine' ")
	private String origine;
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	
	
}
