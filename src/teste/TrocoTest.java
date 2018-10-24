package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;
import troco.Executor;
import troco.Troco;

public class TrocoTest {

	@Test
	public void checkChangeMinorCedules() {
		
		Troco troco = new Troco();
		assertEquals("8", troco.calculateChange(500.61, 360.0));
		assertEquals("11", troco.calculateChange(753.23, 500));
		assertEquals("6", troco.calculateChange(27.07, 20));
	}
	
	@Test
	@Ignore
	public void checkExecutor(){
		
		Executor executor = new Executor();
		Executor.main(null);
	}
	
}
