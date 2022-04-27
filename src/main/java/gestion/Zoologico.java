package gestion;

import java.util.ArrayList; 

public class Zoologico {

	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<>();


	// CONSTRUCTOR

	public Zoologico() {
		this(null, null);
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	// GETTERS AND SETTERS
	public String getNombre() {
			return nombre;
	}

	public void setNombre(String nombre) {
			this.nombre = nombre;
	}

	public String getUbicacion() {
			return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
			return zona;
	}

	// METHODS

	public void agregarZonas(Zona nuevaZona) {
		this.zona.add(nuevaZona);
		
	}
	
	public int cantidadTotalAnimales () {
		int aux = 0;
		for (Zona lista:
			 zona) {
			aux += lista.cantidadAnimales();
		}
		return aux;
	}

}