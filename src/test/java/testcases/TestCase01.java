package testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestSuite;
import testing.support.Cadastro;

public class TestCase01 extends TestSuite{

	@Test
	public void test1(){
		
		Cadastro c = new Cadastro();
		c.envia();
		assertEquals(c.erro, false);
		
		c.finaliza();
	}
}
