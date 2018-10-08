package com.belatrix.cursos.java.basico.util;

import java.util.Random;

import com.belatrix.cursos.java.basico.model.Animal;
import com.belatrix.cursos.java.basico.model.Cat;
import com.belatrix.cursos.java.basico.model.Duck;
import com.belatrix.cursos.java.basico.model.Dog;

/**
 * Creates randomly a new one of 'Animal' subclass instance.
 * @author gshimabukuro
 *
 */
public class AnimalGenerator {
	
	public Animal generateAnimal() {
		this.logHashCode();
		int modRandom = getRandomModValue();
		
		switch (modRandom) {
		case 0:
			return new Dog();
		case 1:
			return new Cat();
		case 2:
			return new Duck();
		default:
			return null;
		}
	}
	
	private int getRandomModValue() {
		int randomValue = (new Random()).nextInt();
		return randomValue % 4;
	}
	
	public void logHashCode() {
		int hashCode = this.hashCode();
		System.out.print("This AnimalGenerator instance hashcode is: " + hashCode + " | ");
	}
	
}
