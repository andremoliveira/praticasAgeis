package troco;

public class Executor {

	public static void main(String[] args) throws Exception {
	
		menu();

	}
	
	public static void menu() throws Exception {
		
		Troco troco = new Troco();
		System.out.println(troco.calculateChange(500.61, 360.0));
	}

}
