package troco;

import java.util.ArrayList;

public class Troco {

	public String calculateChange(double value, double total) {
		
		double change = value - total;
		
		return null;
	}
	
	
	private ArrayList<Money> calculateChangeMinorNotes(double change) {
		
		ArrayList<Money> notes = new ArrayList<>();
		while(change > 100){
			notes.add(Money.CEM);
			change -= 100;
		}
		while(change > 50){
			notes.add(Money.CINQ);
			change -= 50;
		}
		while(change > 10){
			notes.add(Money.DEZ);
			change -= 10;
		}
		while(change > 5){
			notes.add(Money.CINCO);
			change -= 5;
		}
		while(change > 1){
			notes.add(Money.UM);
			change -= 1;
		}
		
		return notes;
		
	}
}
