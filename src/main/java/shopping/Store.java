package shopping;

public class Store {
  public static void main(String[] args) {
//    ClothingPair<String> pstr = new Pair<>("Red", "Red");
    ClothingPair<Sock> ps = new ClothingPair<>(new Sock("Red", 9), new Sock("Red", 10));
    System.out.println("Pair is " + ps);
    System.out.println("matches? " + ps.match());

    ClothingPair<Sock> ps2 = new ClothingPair<>(new Sock("Brown", 9), new Sock("Red", 9));
    System.out.println("pair 2 matches? " + ps2.match());

    ClothingPair<Glove> pg;
  }
}
