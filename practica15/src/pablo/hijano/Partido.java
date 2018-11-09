package pablo.hijano;

import java.util.Random;

public class Partido {
	private Equipo ganador;

	private Equipo perdedor;

	Equipo e1 = new Equipo("Equipo 1", "Malaga", 5, 1978);
	Equipo e2 = new Equipo("Equipo 2", "Nosequelandia", 17, 1972);
	Equipo e3 = new Equipo("Equipo 3", "Barcelona", 3, 1982);
	Equipo e4 = new Equipo("Equipo 4", "Tokyo", 15, 1966);

	public void jugar(Equipo eq1, Equipo eq2) {
		Random r = new Random();
		int n = r.nextInt(101);
		if (n < 50) {
			ganador = eq1;
			perdedor = eq2;
		} else{
			ganador = eq2;
			perdedor = eq1;
		}
	}

	public String consultar() {
		String resultado = "";
		if (ganador != null && perdedor != null) {
			resultado = "El ganador es " + this.getGanador().getNombre() + ", y el perdedor es "
					+ this.getPerdedor().getNombre();
		} else {
			resultado = "Aún no han jugado";
		}
		return resultado;
	}

	public Equipo getGanador() {
		return ganador;
	}

	public Equipo getPerdedor() {
		return perdedor;
	}
	
	public Equipo getE1() {
		return e1;
	}

	public void setE1(Equipo e1) {
		this.e1 = e1;
	}

	public Equipo getE2() {
		return e2;
	}

	public void setE2(Equipo e2) {
		this.e2 = e2;
	}

	public Equipo getE3() {
		return e3;
	}

	public void setE3(Equipo e3) {
		this.e3 = e3;
	}

	public Equipo getE4() {
		return e4;
	}

	public void setE4(Equipo e4) {
		this.e4 = e4;
	}

	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}
}
