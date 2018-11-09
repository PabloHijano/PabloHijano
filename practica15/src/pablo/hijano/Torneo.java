package pablo.hijano;

import java.util.*;

public class Torneo extends Partido {
	List equipos = new ArrayList();
	List partidos = new ArrayList();
	
	public void inscribir(Equipo e) {
		equipos.add(e);
	}
}
