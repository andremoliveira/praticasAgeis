package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;
import troco.Executor;
import troco.Troco;

public class TrocoTest {

	@Test
	public void checkChangeMinorCedules() throws Exception {
		
		Troco troco = new Troco();
		assertEquals( "5 notas e 3 moedas", troco.calculateChange(500.61, 360.0));
		assertEquals( "6 notas e 5 moedas", troco.calculateChange(753.23, 500));
		assertEquals( "3 notas e 3 moedas", troco.calculateChange(27.07, 20));

	}
	
	 @Test(expected = Exception.class)
	 public void checkExceptionChangeMinorCedules() throws Exception{
			Troco troco = new Troco();
			troco.calculateChange(500.61, 600);
		 
	 }
	 
	
	
	
	@Test
	@Ignore
	public void checkExecutor() throws Exception{
		
		Executor executor = new Executor();
		Executor.main(null);
	}
	
}
