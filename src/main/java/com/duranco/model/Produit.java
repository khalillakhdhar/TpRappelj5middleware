package com.duranco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private double prix_unitaire;
@NotNull
private String marque;// instance du produit refusé si marque = null
@Column(nullable = false) // instanciation possible avec cat=null mais impossible de l'accepter ds la BD
private String categorie;
@Column(length = 100)
private String description;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrix_unitaire() {
	return prix_unitaire;
}
public void setPrix_unitaire(double prix_unitaire) {
	this.prix_unitaire = prix_unitaire;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Produit(int id, double prix_unitaire, String marque, String categorie, String description) {
	super();
	this.id = id;
	this.prix_unitaire = prix_unitaire;
	this.marque = marque;
	this.categorie = categorie;
	this.description = description;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Produit [id=" + id + ", prix_unitaire=" + prix_unitaire + ", marque=" + marque + ", categorie=" + categorie
			+ ", description=" + description + "]";
}







}
