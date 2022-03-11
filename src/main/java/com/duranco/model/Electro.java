package com.duranco.model;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Min;

@MappedSuperclass
public class Electro extends Produit {
	@Min(value = 36)
	private int resolution;

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
	
	
	
}
