import java.util.ArrayList;

/*
 * @author 
 */
public class Calculator implements IPostfixCalculator {
    private StackUsingArrayList<Integer> postfix_expression;
    private String linea; 


    public Calculator() {
        this.postfix_expression = new StackUsingArrayList<>();
        this.linea = "";
    }

    @Override
    public int Calculate(ArrayList postfix_expression) throws Exception {
        /*Que lea la línea que es un string y lo empice a dividir y lo coloque en el strack */


        /* Si es un valor númerico hace esto */

        /*Si es un valor no número un operando hace esto otro */
        



        return 0;
    }



}
