import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

    @Test
	public void calculandoParaLetras() throws Exception {
        list.add("Bichita");
		int x = calc.Calculate(list);
		assertEquals(Exception, Exception);
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

