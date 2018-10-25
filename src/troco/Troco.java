package troco;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Troco {

	public List<List<Integer>> calculateChange(double paidTotal, double total) throws Exception {
		
		double change = paidTotal - total;
		
		if (change < 0){
			
			throw new Exception("error message");
		}
		int integerPart = (int)change;
		
		double fractionalPart = change - integerPart;
		
		List<Integer> notes = this.calculateChangeMinorNotes(integerPart);
		List<Integer> coins = this.calculateChangeMinorCoins(fractionalPart);
		
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		ret.add(notes);
		ret.add(coins);
		
		return ret;
	}
	
	
	private List<Integer> calculateChangeMinorNotes(int change) {
		
		List<Integer> notes = new ArrayList<Integer>();
		int totalNotes = 0;
		while(change >= 100){
			totalNotes++;
			change -= 100;
		}
		notes.add(totalNotes);
		totalNotes = 0;
		while(change >= 50){
			totalNotes++;
			change -= 50;
		}
		notes.add(totalNotes);
		totalNotes = 0;
		while(change >= 10){
			totalNotes++;
			change -= 10;
		}
		notes.add(totalNotes);
		totalNotes = 0;
		while(change >= 5){
			totalNotes++;
			change -= 5;
		}
		notes.add(totalNotes);
		totalNotes = 0;
		while(change >= 1){
			totalNotes++;
			change -= 1;
		}
		notes.add(totalNotes);
		
		return notes;
		
	}
	
	private List<Integer> calculateChangeMinorCoins(double change) {
		
		List<Integer> coins = new ArrayList<Integer>();
		int totalCoins = 0;
		while(change >= 0.5){
			totalCoins++;
			change -= 0.5;
		}
		coins.add(totalCoins);
		totalCoins = 0;
		while(change >= 0.1){
			totalCoins++;
			change -= 0.1;
		}
		coins.add(totalCoins);
		totalCoins = 0;
		while(change >= 0.05){
			totalCoins++;
			change -= 0.05;
		}
		coins.add(totalCoins);
		totalCoins = 0;
		while(change >= 0.01){
			totalCoins++;
			change -= 0.01;
		}
		coins.add(totalCoins);
	
		return coins;
		
	}
}
