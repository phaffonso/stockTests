package testing.cases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestSuite;
import testing.context.impl.CadastroWeb;

public class TestCase01 extends TestSuite{

	@Test
	public void test1(){
		
		CadastroWeb c = new CadastroWeb();
		c.envia();
		assertEquals(c.erro, false);
		
		c.finaliza();
	}
}
