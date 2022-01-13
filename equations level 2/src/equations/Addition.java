package equations;

import java.util.ArrayList;


public class Addition extends Expression {

  public Addition(String additionTerm) {
    super();
    String[] terms = additionTerm.split("\\+");
    this.leftTerm = new Constant(terms[0]);
    this.rightTerm = new Constant(terms[1]);
  }

  public Addition(Term leftTerm, Term rightTerm) {
    super(leftTerm, rightTerm);
  }

  @Override
  public int evaluate() {
    return leftTerm.evaluate() + rightTerm.evaluate();
  }

  @Override
  public String toString() {
    return leftTerm.toString() + "+" + rightTerm.toString();
  }

  @Override
  public ArrayList<Term> getVariations() {
    ArrayList<Term> allVariations = new ArrayList<Term>();
  
    ArrayList<Term> leftTermVariations = leftTerm.getVariations();
    // combine with rightTerm to getEquations
    for (Term term : leftTermVariations) {
      Expression newExpression = new Addition(term, this.rightTerm);
      allVariations.add(newExpression);
    }
  
    ArrayList<Term> rightTermVariations = rightTerm.getVariations();
    // combine with leftTerm to getEquations
    for (Term term : rightTermVariations) {
      Expression newExpression = new Addition(this.leftTerm, term);
      allVariations.add(newExpression);
    }
  
    return allVariations;
  }

}
