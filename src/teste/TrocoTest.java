package teste;

import static org.junit.Assert.*;

import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

import javafx.util.Pair;
import jdk.nashorn.internal.ir.annotations.Ignore;
import troco.Executor;
import troco.Troco;

public class TrocoTest {

	@Test
	public void checkChangeMinorCedules() throws Exception {
		
		Troco troco = new Troco();
		List<List<Integer>> valorRetorno = troco.calculateChange(500.61, 360.0);
		List<Integer> notas = valorRetorno.get(0);
		List<Integer> coins = valorRetorno.get(1);
		assertEquals( notas.get(0), equalTo(1));
		assertEquals( notas.get(1), equalTo(0));
		assertEquals( notas.get(2), equalTo(4));
		assertEquals( notas.get(3), equalTo(0));
		assertEquals( notas.get(4), equalTo(0));
		
		assertEquals( coins.get(0), equalTo(1));
		assertEquals( coins.get(0), equalTo(1));
		assertEquals( coins.get(0), equalTo(0));
		assertEquals( coins.get(0), equalTo(1));
//		assertEquals( , troco.calculateChange(500.61, 360.0));
//		assertEquals( , troco.calculateChange(753.23, 500));
//		assertEquals( , troco.calculateChange(27.07, 20));

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
