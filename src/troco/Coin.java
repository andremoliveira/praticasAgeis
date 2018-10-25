package troco;

public enum Coin {

	CINQ(50),
	DEZ(10),
	CINCO(5),
	UM(1);
	
	int value;
	
	Coin(int value) {
		this.value = value;
	}
	
}
