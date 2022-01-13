package equations;


public abstract class Expression implements Term {

  public Term leftTerm;
  public Term rightTerm;

  public Expression(Term pLeftTerm, Term pRightTerm) {
    leftTerm = pLeftTerm;
    rightTerm = pRightTerm;
  }

  public Expression() {
  }
}
