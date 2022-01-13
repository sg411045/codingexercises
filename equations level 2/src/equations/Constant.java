package equations;

import java.util.ArrayList;
import java.util.List;

public class Constant implements Term {

  public int constant;
  public DigitTransformationDictionary digitTransformationDictionary =
    new DigitTransformationDictionary();

  public Constant(int i) {
    this.constant = i;
  }

  public Constant() {
    this.constant = 0;
  }

  public Constant(String constantAsString) {
    this.constant = Integer.parseInt(constantAsString);
  }

  @Override
  public int evaluate() {
    return this.constant;
  }

  @Override
  public String toString() {
    return String.valueOf(this.constant);
  }

  @Override
  public ArrayList<Term> getVariations() {
    ArrayList<Term> variations = new ArrayList<Term>();
    List<String> possibleTransformations =
      digitTransformationDictionary.getPossibleTransformationsForDigit(String
        .valueOf(this.constant));

    for (String transformedDigit : possibleTransformations) {
      Term term = new Constant(transformedDigit);
      variations.add(term);
    }
    return variations;
  }
}
