package com.duranco.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Meuble extends Produit {
private String usine;

public String getUsine() {
	return usine;
}

public void setUsine(String usine) {
	this.usine = usine;
}





}
