package com.belatrix.cursos.java.basico;

import com.belatrix.cursos.java.basico.model.Animal;
import com.belatrix.cursos.java.basico.util.AnimalGenerator;
import com.belatrix.cursos.java.basico.util.AnimalGeneratorSingleton;

public class AnimalTestBench {

	public static void main(String[] args) {
		
		// In order to avoid having all method declared as static, a instance of AnimalTestBench has been created.
		AnimalTestBench bench = new AnimalTestBench();
				
		/*
		 * These are 3 different ways to iterate over a collection
		 */
		
		bench.loopAnimalsCollectionUsingFor();
		
//		bench.loopAnimalsCollectionUsingWhile();
		
//		bench.loopAnimalsCollectionUsingDoWhile();
		
		
	}
	
	/**
	 * Process each object of the collection, using 'for' statement.
	 */
	private void loopAnimalsCollectionUsingFor() {
		for (int i = 0; i < 100; i++) {
			// On each iteration, it's needed to have an concrete instance of an Animal that could be
			// a Dog, Cat or Duck instance but not an Animal because it is an abstract class.
			// In order to obtain that instance, we use an instance of AnimalGenerator
			AnimalGenerator animalInstanceGenerator = getAnimalGenerator(true);
			
			Animal oAnimal = animalInstanceGenerator.generateAnimal();
			
			if (oAnimal != null) 
				oAnimal.makeNoise(i);
			else 
				System.out.println();
		}
	}
	
	/**
	 * Process each object of the collection, using 'while' statement.
	 */
	private void loopAnimalsCollectionUsingWhile() {
		int i = 0;
		while (i < 100 ) {
			
			AnimalGenerator animalInstanceGenerator = getAnimalGenerator(false);
			
			Animal oAnimal = animalInstanceGenerator.generateAnimal();			
			
			if (oAnimal != null) 
				oAnimal.makeNoise(i++);
			else 
				System.out.println();
		}
	}
	
	/**
	 * Process each object of the collection, using 'do-while' statement.
	 */
	private void loopAnimalsCollectionUsingDoWhile() {
		int i = 0;
		do {
			AnimalGenerator animalInstanceGenerator = getAnimalGenerator(false);
			Animal oAnimal = animalInstanceGenerator.generateAnimal();
			
			if (oAnimal != null) 
				oAnimal.makeNoise(i++);
			else 
				System.out.println();
		} while (i < 100 );
	}
	
	/**
	 * Method to obtain an instance of AnimalGenerator
	 * @return
	 */
	private AnimalGenerator getAnimalGenerator(boolean usingSingleton) {
		
		if (!usingSingleton) {
			// Each iteration instantiates its own AnimalGenerator
			AnimalGenerator animalGenerator = new AnimalGenerator();
			return animalGenerator;
		} else {
			// Using AnimalGeneratorSingleton, only one instance of AnimalGenerator is 
			// reused several times to generate all the Animal objects. It could be validated 
			// by looking that every traces of AnimalGenerator hash code are showing the same value
			AnimalGenerator animalGenerator = AnimalGeneratorSingleton.getInstance().getAnimalGenerator();
			return animalGenerator;	
		}
	}

}
