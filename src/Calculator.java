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
        
        return 0;
    }

}
