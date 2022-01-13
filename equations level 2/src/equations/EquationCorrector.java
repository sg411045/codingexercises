package equations;

import java.util.ArrayList;

public class EquationCorrector {

  public String correctEquation(String equationAsString) {

    Equation equation = new EquationFactory().createEquation(equationAsString);
    if (equation.isEquationValid())
      return equation.toString();
    else {
      ArrayList<Equation> variationsList = equation.getVariations();

      for (Equation equationVariation : variationsList) {
        if (equationVariation.isEquationValid()) {
          return equationVariation.toString();
        }
      }
    }
    return "";
  }
}
