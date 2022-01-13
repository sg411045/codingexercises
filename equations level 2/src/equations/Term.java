package equations;

import java.util.ArrayList;

public interface Term {

  public abstract int evaluate();

  public abstract String toString();

  public abstract ArrayList<Term> getVariations();
}
