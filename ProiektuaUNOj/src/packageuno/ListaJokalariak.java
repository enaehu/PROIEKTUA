package packageuno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListaJokalariak {
		
	private static ArrayList<Jokalaria> listajokalariak = new ArrayList<Jokalaria>();
	
	public static void main ( String [] arguments ) throws IOException {
		boolean bukaera = false;
		System.out.println("PARTIDA HASI DA");		
		//jokalariak sortu
		for (int i= 0; i < 2; i++)
		{
			listajokalariak.add(new Jokalaria());
		}
		int txanda = 1;
		while (bukaera == false) {
			int erabakitakoAukera = 0;
			boolean aukeraEgokia = false;
			Jokalaria jokalariActual = listajokalariak.get(txanda);
			System.out.println("JOKALARI "+ txanda+ " HAUTATU AUKERA BAT");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while(aukeraEgokia  == false) {
		        System.out.println("AUKERA[1]: KARTA JAURTI, AUKERA [2] KARTA HARTU, AUKERA [3] JOLASA AMAITU");
		        try{
		            erabakitakoAukera= Integer.parseInt(br.readLine());
		            if(erabakitakoAukera == 1 || erabakitakoAukera== 2 || erabakitakoAukera== 3) {
		            	aukeraEgokia = true;
		            }
		        }catch(NumberFormatException nfe){
		            System.err.println("Aukera desegokia!");
		        }
	        }
	        System.out.println("AUKERATUTAKOA: " + erabakitakoAukera);
	        switch(erabakitakoAukera) {
		        case 1:
					int aukeratutakoKarta= 0;
					boolean kartaEgokia= false;
					while(kartaEgokia == false) {
					System.out.println("KARTA BAT AUKERATU");
					jokalariActual.imprimatuEskua();
					try{
						aukeratutakoKarta= Integer.parseInt(br.readLine());
			            //if(aukeratutakoKarta <= LISTAJOKALARI[turno].Eskua.length) {
							kartaEgokia= true;
			            //}
			        }catch(NumberFormatException nfe){
			            System.err.println("Ez da karta egokia!");
			        }
					//Karta k = JokalariActuala[opcion]
					//if(k.comprobarSiEsValida)
					}
		          break;
		        case 2:
		          // code block
		          break;
		        default:
		          // code block
		      }
	        	
			if (erabakitakoAukera == 3)
			{
				bukaera = true;
			}
			//Turno --> TURNO++ If turno == 3 then turno = 1;
			
			//En caso de que decida tirar carta un segundo switch con que carta lanzar
			//Comprobar si le queda 1 o ha ganado.
			//Cambio de Turno
		}
		System.out.println("JOLASAREN AMAIERA");
		//FIN DEL JUEGO
	}
}



