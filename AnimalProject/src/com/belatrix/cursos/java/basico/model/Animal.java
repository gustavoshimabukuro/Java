package com.belatrix.cursos.java.basico.model;

public abstract class Animal {

	protected String sound;
	
	public void breathe(String additionals) {
		System.out.print("Breathing ... " + additionals);
	}
	
	public void makeNoise(int i) {
		breathe(" index: " + i + ", ");
	}
	
}
