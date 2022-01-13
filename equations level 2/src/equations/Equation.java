package equations;

import java.util.ArrayList;

public class Equation {

  public Term leftTerm;
  public Term rightTerm;

  public Equation() {
  }

  public Equation(Term leftTermVariation, Term rightTermVariation) {
    this.leftTerm = leftTermVariation;
    this.rightTerm = rightTermVariation;
  }

  public boolean isEquationValid() {
    return (leftTerm.evaluate() == rightTerm.evaluate());
  }

  public String toString() {
    return leftTerm.toString() + "=" + rightTerm.toString();
  }

  public ArrayList<Equation> getVariations() {
    ArrayList<Equation> variations = new ArrayList<Equation>();

    // left Term variations
    for (Term leftTermVariation : leftTerm.getVariations()) {
      Equation varEquation = new Equation(leftTermVariation, this.rightTerm);
      variations.add(varEquation);
    }

    // right Term variations
    for (Term rightTermVariation : rightTerm.getVariations()) {
      Equation varEquation = new Equation(this.leftTerm, rightTermVariation);
      variations.add(varEquation);
    }

    return variations;
  }
}
