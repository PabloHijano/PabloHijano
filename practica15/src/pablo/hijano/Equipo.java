package pablo.hijano;

public class Equipo {
	private String nombre;
	private String ciudad;
	private int nTitulos;
	private int fecha;

	public Equipo(String nombre, String ciudad, int nTitulos, int fecha) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.nTitulos = nTitulos;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getnTitulos() {
		return nTitulos;
	}

	public int getFecha() {
		return fecha;
	}
}
