package packageuno;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;
public class Baraja {

	private ListaKartak lista;
	private static Baraja instantziaBakarra=null;
	
	private Baraja () {
		this.lista= new ListaKartak();}
		// KARTEN LISTA SORTU
		//hfjjtitit
		public void galderakKonfiguratu(){
			
			String[] zatiak= new String[2];

			InputStream fitx = this.getClass().getClassLoader().getResourceAsStream("C:\\KartaGuztiak.txt");

			InputStreamReader in= new InputStreamReader(fitx);//("C:\\archivo.txt");
			
			Scanner sc; 

			
			sc = new Scanner(in);
			String galderaErantzuna = sc.nextLine();
			zatiak= galderaErantzuna.split("  ");
		 	String kolorea = zatiak[0];
			String zenbakia = zatiak[1];
			int eranEgokia = Integer.parseInt(zenbakia);
			
		}
		/*	
		Karta gorria0= new BatBederatzi("Gorria", 0);
		Karta gorria1= new BatBederatzi("Gorria", 1);
		Karta gorria2= new BatBederatzi("Gorria", 2);
		Karta gorria3= new BatBederatzi("Gorria", 3);
		Karta gorria4= new BatBederatzi("Gorria", 4);
		Karta gorria5= new BatBederatzi("Gorria", 5);
		Karta gorria6= new BatBederatzi("Gorria", 6);
		Karta gorria7= new BatBederatzi("Gorria", 7);
		Karta gorria8= new BatBederatzi("Gorria", 8);
		Karta gorria9= new BatBederatzi("Gorria", 9);
		
		Karta horia0= new BatBederatzi("Horia", 0);
		Karta horia1= new BatBederatzi("Horia", 1);
		Karta horia2= new BatBederatzi("Horia", 2);
		Karta horia3= new BatBederatzi("Horia", 3);
		Karta horia4= new BatBederatzi("Horia", 4);
		Karta horia5= new BatBederatzi("Horia", 5);
		Karta horia6= new BatBederatzi("Horia", 6);
		Karta horia7= new BatBederatzi("Horia", 7);
		Karta horia8= new BatBederatzi("Horia", 8);
		Karta horia9= new BatBederatzi("Horia", 9);
		
		Karta berdea0= new BatBederatzi("Berdea", 0);
		Karta berdea1= new BatBederatzi("Berdea", 1);
		Karta berdea2= new BatBederatzi("Berdea", 2);
		Karta berdea3= new BatBederatzi("Berdea", 3);
		Karta berdea4= new BatBederatzi("Berdea", 4);
		Karta berdea5= new BatBederatzi("Berdea", 5);
		Karta berdea6= new BatBederatzi("Berdea", 6);
		Karta berdea7= new BatBederatzi("Berdea", 7);
		Karta berdea8= new BatBederatzi("Berdea", 8);
		Karta berdea9= new BatBederatzi("Berdea", 9);
		
		Karta urdina0= new BatBederatzi("Urdina", 0);
		Karta urdina1= new BatBederatzi("Urdina", 1);
		Karta urdina2= new BatBederatzi("Urdina", 2);
		Karta urdina3= new BatBederatzi("Urdina", 3);
		Karta urdina4= new BatBederatzi("Urdina", 4);
		Karta urdina5= new BatBederatzi("Urdina", 5);
		Karta urdina6= new BatBederatzi("Urdina", 6);
		Karta urdina7= new BatBederatzi("Urdina", 7);
		Karta urdina8= new BatBederatzi("Urdina", 8);
		Karta urdina9= new BatBederatzi("Urdina", 9);
		
		
		lista.gehituKarta(gorria0);
		lista.gehituKarta(gorria1);
		lista.gehituKarta(gorria2);
		lista.gehituKarta(gorria3);
		lista.gehituKarta(gorria4);
		lista.gehituKarta(gorria5);
		lista.gehituKarta(gorria6);
		lista.gehituKarta(gorria7);
		lista.gehituKarta(gorria8);
		lista.gehituKarta(gorria9);
		
		lista.gehituKarta(horia0);
		lista.gehituKarta(horia1);
		lista.gehituKarta(horia2);
		lista.gehituKarta(horia3);
		lista.gehituKarta(horia4);
		lista.gehituKarta(horia5);
		lista.gehituKarta(horia6);
		lista.gehituKarta(horia7);
		lista.gehituKarta(horia8);
		lista.gehituKarta(horia9);
		
		lista.gehituKarta(berdea0);
		lista.gehituKarta(berdea1);
		lista.gehituKarta(berdea2);
		lista.gehituKarta(berdea3);
		lista.gehituKarta(berdea4);
		lista.gehituKarta(berdea5);
		lista.gehituKarta(berdea6);
		lista.gehituKarta(berdea7);
		lista.gehituKarta(berdea8);
		lista.gehituKarta(berdea9);
		
		lista.gehituKarta(urdina0);
		lista.gehituKarta(urdina1);
		lista.gehituKarta(urdina2);
		lista.gehituKarta(urdina3);
		lista.gehituKarta(urdina4);
		lista.gehituKarta(urdina5);
		lista.gehituKarta(urdina6);
		lista.gehituKarta(urdina7);
		lista.gehituKarta(urdina8);
		lista.gehituKarta(urdina9);
		
	
	}*/
	
	public static Baraja getNireInstatziaBakarra() {
		if(instantziaBakarra==null) {
			instantziaBakarra= new Baraja();
		}
		return instantziaBakarra;
	}
	

	
	public void jokatuPartida(int pJokalariKop) { 
		//TODO 
	}
	 
	
	/*public void errekorrituBaraja() { Karta kartaBat=null; Iterator<Karta>
	  itr=this.getIteradorea();
	  }
	 
	
	/*  public void kartakBanatu() { Jokalari1 pJok1=null; Jokalari2 pJok2=null;
	  Karta kartaBat=null; int kop=0; Iterator<Karta> itr=this.getIteradorea();
	  while (itr.hasNext() || kop<=7) { kartaBat=itr.next();
	  pJok1.hartuKarta(kartaBat); kartaBat= itr.next(); kop=kop+1; }
	  }
	 */
}
