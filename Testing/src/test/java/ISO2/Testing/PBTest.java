package ISO2.Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PBTest {
	private static Persona p;
	private static Bus b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(false, false, false, true, false, 20);
		b = new Bus(30, 3, 14);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrecioBillete() {
		try {
			assertEquals(2.2, PB.precioBillete(p, b, 30), 0.001);
			
		} catch (NumeroNegativoException nne) {
			System.out.println(nne.getMessage());
		} catch (NoViajarException nve) {
			System.out.println(nve.getMessage());
		} catch (AforoCompletoException ace) {
			System.out.println(ace.getMessage());
		}
	}

}
