package shopping;

import java.time.LocalDate;

public class UseAPair {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Hello", "Bonjour");
    String leftString = p.getLeft();
//    p.setRight(LocalDate.now());
    p.setRight("Guten Tag");
  }

}
