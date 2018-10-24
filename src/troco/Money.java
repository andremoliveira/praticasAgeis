package troco;

public enum Money {

	CEM(100),
	CINQ(50),
	DEZ(10),
	CINCO(5),
	UM(1);
	
	public int value;
	
	Money(int value) {
		this.value = value;
	}
	
}
