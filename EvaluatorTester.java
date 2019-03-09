/**
 * Class to help test your Evaluator:
 * javac EvaluatorTester
 * java EvaluatorTester "1+2" "3*5"
 */
public class EvaluatorTester {
  public static void main(String[] args) {
    Evaluator evaluator = new Evaluator();

    for ( String arg : args ) {
      System.out.format( "%s = %d\n", arg, evaluator.eval( arg ) );
    }
  }
}
