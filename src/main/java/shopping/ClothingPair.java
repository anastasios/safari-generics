package shopping;


// Can use extends as a constraint with ONE class type (which must be
// listed first) and as many interfaces as you like
public class ClothingPair<E extends Sized & Colored/*, String*/> extends Pair<E> {
//  java.lang.String s = "Hello";
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean match() {
    return left.getSize() == right.getSize() &&
        left.getColor().equals(right.getColor());
  }
}
