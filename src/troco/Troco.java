package troco;

import java.util.ArrayList;

public class Troco {

	public String calculateChange(double paidTotal, double total) throws Exception {
		
		double change = paidTotal - total;
		
		if (change < 0){
			
			throw new Exception("error message");
		}
		int integerPart = (int)change;
		
		double fractionalPart = change - integerPart;
		
		ArrayList<Money> notes = this.calculateChangeMinorNotes(integerPart);
		ArrayList<Coin> coins = this.calculateChangeMinorCoins(fractionalPart);
		
		return notes.size() + " notas e " + coins.size() + " moedas";
	}
	
	
	private ArrayList<Money> calculateChangeMinorNotes(int change) {
		
		ArrayList<Money> notes = new ArrayList<>();
		while(change >= 100){
			notes.add(Money.CEM);
			change -= 100;
		}
		while(change >= 50){
			notes.add(Money.CINQ);
			change -= 50;
		}
		while(change >= 10){
			notes.add(Money.DEZ);
			change -= 10;
		}
		while(change >= 5){
			notes.add(Money.CINCO);
			change -= 5;
		}
		while(change >= 1){
			notes.add(Money.UM);
			change -= 1;
		}
		
		return notes;
		
	}
	
	private ArrayList<Coin> calculateChangeMinorCoins(double change) {
		
		ArrayList<Coin> coins = new ArrayList<>();
		while(change >= 0.5){
			coins.add(Coin.CINQ);
			change -= 0.5;
		}
		while(change >= 0.1){
			coins.add(Coin.DEZ);
			change -= 0.1;
		}
		while(change >= 0.05){
			coins.add(Coin.CINCO);
			change -= 0.05;
		}
		while(change >= 0.01){
			coins.add(Coin.UM);
			change -= 0.01;
		}
	
		return coins;
		
	}
}
