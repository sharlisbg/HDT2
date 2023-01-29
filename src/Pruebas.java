import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author Sharis Barrios
 *
 */

public class Pruebas {

    Calculator calc = new Calculator();
    ArrayList<String> list = new ArrayList<String>();


    @Test
	public void calculando() throws Exception {
        list.add("1 2 + 4 * 3 +");
		int x = calc.Calculate(list);
		assertEquals(15, x);
	}

}

