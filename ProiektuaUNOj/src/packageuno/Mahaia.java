package packageuno;

public class Mahaia {

	private ListaKartak lista;
	private static Mahaia bakarra=null;
	
	private Mahaia() {
		this.lista= new ListaKartak();	}
	
	public static Mahaia getBakarra() {
		if(bakarra==null) {
			bakarra= new Mahaia();
		}
		return bakarra;
	}
	public Karta azkenKarta() {
		return this.lista.azkenKarta();
	}
}
