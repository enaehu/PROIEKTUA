package packageuno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaKartak {
	private ArrayList<Karta> lista;
	//komentarioa
	public ListaKartak() {
		this.lista=new ArrayList<Karta>();
	}

	public void gehituKarta(Karta pKarta) {
		lista.add(pKarta);
	}
	
	private Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
	
	public Karta hartuKarta() {
		Random rand = new Random();
		int n = rand.nextInt(this.lista.size());
		Karta k = lista.get(n);
		lista.remove(n);
		return k;
	}
	
	public int getTamaina() {
		
		return this.lista.size();
	}
	//github prueba
	
	public Karta get(int i) {
		return lista.get(i);
	}
	
	public Karta azkenKarta() {
	 int azkena=0;
	 azkena= this.lista.size();
	 return this.lista.get(azkena);
	}
}
