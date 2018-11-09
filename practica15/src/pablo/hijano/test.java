package pablo.hijano;

public class test {

	public static void main(String[] args) {
		Torneo t = new Torneo(); 
		Partido p1 = new Partido();
		
		t.inscribir(t.e1);
		System.out.println(t.equipos.get(0));
		t.jugar(t.getE2(), t.getE1());
		System.out.println(t.consultar());
	}
}
