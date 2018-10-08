package com.belatrix.cursos.java.basico.model;

public class Cat extends Animal {

	@Override
	public void makeNoise(int i) {
		super.makeNoise(i);
		System.out.println(" Meow ...");
	}

}
