package ISO2.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaTest {
	
	private static Prueba p;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Prueba(1,2);
	}

	@Test
	public void testOperar() {
		assertEquals(3, p.operar(1));
	}

	@Test
	public void testMayorN1() {
		assertFalse(p.mayorN1());
	}

	@Test
	public void testMayorN2() {
		assertTrue(p.mayorN2());
	}
	
	

}
