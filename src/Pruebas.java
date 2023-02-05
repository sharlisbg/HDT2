import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import java.lang.Exception;

/**
 * @author Sharis Barrios
 *
 */

public class Pruebas {

    PostfixCalculator calc = new PostfixCalculator();
    ArrayList<String> list = new ArrayList<String>();


    @Test
	public void calculandoConExito() throws Exception {
        list.add("1 2 + 4 * 3 +");
		int x = calc.Calculate(list);
		assertEquals(15, x);
	}

    @Test
	public void calculandoConExito2() throws Exception {
        list.add("1 2 + 3 *");
		int x = calc.Calculate(list);
		assertEquals(9, x);
	}

    /**
     * @throws Exception
     */
    @Test(expected = Exception.class)  
	public void calculandoParaLetras() {
        list.add("Bichita");
		try {
			int x = calc.Calculate(list);
			assertEquals(x, x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// ejecutamos la código que debiera lanzar la excepción
	}

    
    @Test
	public void calculandoDivisionBajoCero() throws Exception {
        list.add("4 0 /");
		int x = calc.Calculate(list);
		assertThrows("Usted esta realizando una division por cero", null, x);
	}

    @Test
	public void calculandoConNumerosFaltante() throws Exception {
        list.add("3 *");
		int x = calc.Calculate(list);
		assertEquals(Exception, x);
	}

}

