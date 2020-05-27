package shopping;

import java.util.List;

// <F> IN THIS POSITION is a declaration of a compile-time
// type parameter or type variable
public class Pair<F> {
  F left;
  F right;

  public Pair(F left, F right) {
    this.left = left;
    this.right = right;
  }

  // Option 2 (option 1 is make a specific subclass for PairOfMatchableClothing)
  // fails because left/right are object...
//  public boolean matched() {
//    if (left instanceof Sock...) // Ugly!!!
//    return left.getSize() == right.getSize();
//  }

  // option 3 (good) "command pattern"
  // add a "test method" that takes a BiPredicate...
  // option 3a (also good) "strategy" pattern

  public F getLeft() {
    return left;
  }

  public F getRight() {
    return right;
  }

  public void setLeft(F left) {
    this.left = left;
  }

  public void setRight(F right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }

  public static void doStuff() {
    List<String> ls = null;
    String s = ls.get(0);
  }
}

class StringPair extends Pair<String> {
  public StringPair(String left, String right) {
    super(left, right);
  }

  // this causes the creation of a "Bridge" method
  // of the original form i.e. setLeft(Object o);
  // The bridge checks/casts the argument to object,
  // then invokes this method...
  @Override
  public void setLeft(String s) { // Isn't this an "overLOAD"???

  }
}

