package equations;

import java.util.ArrayList;

public class Subtraction extends Expression {

  public Subtraction(Term leftTerm, Term rightTerm) {
    super(leftTerm, rightTerm);
  }

  public Subtraction(String subtractionTerm) {
    super();
    String[] terms = subtractionTerm.split("\\-");
    this.leftTerm = new Constant(terms[0]);
    this.rightTerm = new Constant(terms[1]);
  }

  @Override
  public int evaluate() {
    return leftTerm.evaluate() - rightTerm.evaluate();
  }

  @Override
  public String toString() {
    return leftTerm.toString() + "-" + rightTerm.toString();
  }

  @Override
  public ArrayList<Term> getVariations() {
    ArrayList<Term> allVariations = new ArrayList<Term>();

    ArrayList<Term> leftTermVariations = leftTerm.getVariations();
    // combine with rightTerm to getEquations
    for (Term term : leftTermVariations) {
      Expression newExpression = new Subtraction(term, this.rightTerm);
      allVariations.add(newExpression);
    }

    ArrayList<Term> rightTermVariations = rightTerm.getVariations();
    // combine with leftTerm to getEquations
    for (Term term : rightTermVariations) {
      Expression newExpression = new Subtraction(this.leftTerm, term);
      allVariations.add(newExpression);
    }

    return allVariations;
  }
}
