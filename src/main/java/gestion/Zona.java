package gestion;

import java.util.ArrayList; 
import zooAnimales.Animal;

public class Zona {

	private String nombre;
	private Zoologico Zoo;
	private ArrayList <Animal> animales = new ArrayList<>();


	// CONSTRUCTORS

	public Zona() {
		this (null, null);
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		Zoo = zoo;
	}


	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return Zoo;
	}

	public void setZoo(Zoologico zoo) {
		Zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	// METHODS

	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}

	public int cantidadAnimales() {
		return animales.size();
	}

}