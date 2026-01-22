package com.m2i.course2;

	
	//Classe abstraite
	abstract class AbstractAnimal {
	// Attribut commun à tous les animaux
	String nom;
	// Constructeur de la classe abstraite
	AbstractAnimal(String nom) {
	    this.nom = nom;
	}
	// Méthode abstraite (oblige les sous-classes à implémenter leur propre version)
	abstract void faireDuBruit();
	// Méthode concrète (déjà définie dans la classe abstraite)
	void dormir() {
	    System.out.println(nom + " dort...");
	}
	

	public class AbstractClassTest {
		public static void main(String[] args) {
		    AbstractAnimal chien = new ClasseChien("Rex");
		    chien.faireDuBruit();
		    chien.dormir();
		    AbstractAnimal chat = new ClasseChat("Misty");
		    chat.faireDuBruit();
		    chat.dormir();
		}
		}



   }
	
	//Sous-classe qui hérite de Animal
	class ClasseChien extends AbstractAnimal {
		ClasseChien(String nom) {
	    super(nom);
	}
			@Override
			void faireDuBruit() {
			    System.out.println(nom + " aboie : Woof woof !");
			}
	}

			//Une autre sous-classe
			class ClasseChat extends AbstractAnimal {
				ClasseChat(String nom) {
			    		super(nom);
					}
					@Override
					void faireDuBruit() {
					    System.out.println(nom + " miaule : Meow !");
					}
		  }
			



	



