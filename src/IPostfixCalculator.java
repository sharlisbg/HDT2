import java.util.ArrayList;
/**
 * @author Seccion 40
 */
public interface IPostfixCalculator<T> {
	public int Calculate(ArrayList<T> postfix_expression) throws Exception;
}