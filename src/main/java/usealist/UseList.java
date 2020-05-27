package usealist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseList {
  public static void breakList(List l) {
    l.add(0, LocalDate.now());
  }
  public static void main(String[] args) {
//    List names = new ArrayList();

    // List / ArrayList "reifiable type" -- can make a real one of them
    // List<String> "non-reifiable" -- never really exists (figment of
    // compiler's imagination)
    List<String> names =
        new ArrayList<>(Arrays.asList("Albert"));
//        new ArrayList<String>(Arrays.asList(LocalDate.now(), "Albert"));

    // Java 9+ only for var...
    // type of names would be inferred as List<Object>
//    var names = new ArrayList<>(
//           Arrays.asList(LocalDate.now(), "Fred"));

    names.add("Fred");
    names.add("Jim");

    if (names instanceof List) {
      System.out.println("names is a list...");
    }

    // List<String> is "non-reifiable" type, not real at runtime
    // therefore cannot check for it...
//    if (names instanceof List<String>) {
//      System.out.println("names is a list...");
//    }

//    names.add(LocalDate.now());

//    breakList(names);
//    String s = (String)names.get(0);

    // javap -c -cp <classpath> usealist.UseList
    String s = names.get(0);
    System.out.println("First name is " + names.get(2));

    System.out.println("names refers to an: " + names.getClass().getName());

    String [] sa = {"Fred", "Jim", "Sheila"};
    System.out.println("sa refers to a: " + sa.getClass().getName());

    System.out.println(sa);
    for (String str : sa) {
      System.out.println("> " + str);
    }

    // Generics "don't work with" primitives, only ref types
//    List<int> li;
    List<Number> intList = new ArrayList<>();
    intList.add(3L); // Autoboxing (and unboxing)
  }
}
