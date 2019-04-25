package packageuno;

public class BatBederatzi extends Karta {
	//atributuak
		private int zenb;
		
		public BatBederatzi(String pKolorea, Integer pZenb) {
			super(pKolorea);
			this.zenb=pZenb;
		}
		
		@Override
		public String toString() {
			return this.zenb + " " +this.kolorea;
		}
		
		 public void kartaEgikaritu(Jokalaria pJok1) {
			 
		 }
}
