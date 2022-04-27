package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{

	private static final ArrayList <Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private final String colorPiel;
	private final boolean venenoso;


	// CONSTRUCTORS

	public Anfibio () {
		super(null, 0, null, null);
		this.colorPiel = null;
		this.venenoso = false;
		listado.add(this);
	}
	public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel , boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	// GETTERS

	public boolean isVenenoso() {
		return venenoso;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public static int cantidadAnfibios() {
		return listado.size();
	}

	@Override
	public String movimiento() {
		return "saltar";
	}

	// OTHER METHODS

	public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas++;
        return rana;
    }

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
    }

}
