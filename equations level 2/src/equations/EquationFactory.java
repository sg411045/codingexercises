package equations;

public class EquationFactory {

  public Equation createEquation(String equationAsString) {
    Equation equation = new Equation();

    String terms[] = equationAsString.split("\\=");

    equation.leftTerm = getTerm(terms[0]);
    equation.rightTerm = getTerm(terms[1]);

    return equation;
  }

  private Term getTerm(String termAsString) {
    Term term = null;

    if (termAsString.contains("+")) {
      term = new Addition(termAsString);
    } else if (termAsString.contains("-")) {
      term = new Subtraction(termAsString);
    } else {
      term = new Constant(termAsString);
    }

    return term;
  }
}
