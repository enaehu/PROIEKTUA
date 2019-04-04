package packageuno;

public class Teklatua {

	private static Teklatua bakarra=null;
	
	private static Teklatua() {
		this
	}
	public  Teklatua getBakarra() {
		if(bakarra==null) {
			bakarra=new Teklatua();
		}
		return bakarra;
	}
}
