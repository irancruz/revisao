package exemplos;

public class TesteLampada {

	public static void main(String[] args) {
		
		
		Fabricante fab = new Fabricante();		
		fab.setNome("Velux");
		fab.setSigla("vlx");
		
		Lampada lamp1 = new Lampada();
		lamp1.setPotencia(20);
		lamp1.setFabricante(fab);
		lamp1.acender();		
		
		//lamp1.acender();
		
		//lamp1.setPotencia(60);		
		
		System.out.println(lamp1);
	}
}
