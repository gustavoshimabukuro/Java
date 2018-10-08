package com.belatrix.cursos.java.basico.util;

public class AnimalGeneratorSingleton {

	private AnimalGenerator animalGenerator;
	private static AnimalGeneratorSingleton instance;
	private AnimalGeneratorSingleton() {
		this.animalGenerator = new AnimalGenerator();
	};
	
	public static AnimalGeneratorSingleton getInstance() {
		if (instance == null) {
			instance = new AnimalGeneratorSingleton();
		}
		return instance;
	}
	
	public AnimalGenerator getAnimalGenerator() {
		return this.animalGenerator;
	}
 	
}
