import java.util.ArrayList;

/*
 * @author 
 */
public class Calculator implements IPostfixCalculator<String> {
    StackUsingArrayList<Integer> calc;
    ArrayList<String> lista; 


    public Calculator() {
        this.calc = new StackUsingArrayList<Integer>();
        this.lista = new ArrayList<String>();
    }

    @Override
    public int Calculate(ArrayList<String> lista) throws Exception {
        StackUsingArrayList<Integer> calc = new StackUsingArrayList<Integer>();

        for (String string : lista){
            for (int i = 0; i < string.length(); i++) {
                String[] parts = string.split(" ");
                
                for (String list : parts){
                    for (int w = 0; w < list.length(); w++) {
                        char c = list.charAt(w);
                        int x = 0; int y = 0; int r = 0;
                        if(Character.isDigit(c)){
                            int t = Character.getNumericValue(c);
                            calc.push(t);
                        }
                        else if(c == '+'){
                            x = calc.peek();
                            calc.pull();
                            y = calc.peek();
                            calc.pull();
                            r = x+y;
                            calc.push(r);
                        }
                        else if(c == '-'){
                            x = calc.peek();
                            calc.pull();
                            y = calc.peek();
                            calc.pull();
                            r = y-x;
                            calc.push(r);
                        }
                        else if(c == '*'){
                            x = calc.peek();
                            calc.pull();
                            y = calc.peek();
                            calc.pull();
                            r = x*y;
                            calc.push(r);
                        }
                        else if(c == '/'){
                            x = calc.peek();
                            calc.pull();
                            y = calc.peek();
                            calc.pull();
                            r = y/x;
                            calc.push(r);
                        }
                    }
                }
                int a = calc.peek();
                calc.pull();
                System.out.println(a);
            }
        }
        return 0;
    }

}
