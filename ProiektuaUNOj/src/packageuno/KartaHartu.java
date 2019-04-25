package packageuno;

public class KartaHartu extends Bereziak {
	public KartaHartu(String pKolorea) {
		super(pKolorea);
	}
	
	 public void kartaEgikaritu(Jokalaria pJok1) {
		 int kont=0;
		 while (kont<=4) {
		 pJok1.hartuKartaBat();
		 kont=kont+1;
		 }
	 }
}
