package com.belatrix.cursos.java.basico.model;

public class Duck extends Animal {

	@Override
	public void makeNoise(int i) {
		super.makeNoise(i);
		System.out.println(" Quack ...");
	}

}
