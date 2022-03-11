package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.duranco.model.Produit;

@RestController
public class MainController {
@GetMapping("")
public ModelAndView homePage()
{
ModelAndView model=new ModelAndView("produit.html");
return model;
}
@PostMapping("envoyer")
public String getProduct(@RequestParam int id, String marque, String categorie,String description, double prix_unitaire)
{
	Produit p=new Produit(id, prix_unitaire, marque, categorie, description);
	return p.toString();
}
}
