package nonreifiable;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Example {
  public static <F, E extends F> F[] getAsArray(List<E> le, Class<F> c) {
//    E[] data = new E[le.size()]; // Type erasure!! E is Non-reifiable..
//    E[] data = (E[])(new Object[le.size()]);
//    E[] data = (E[]) (Array.newInstance(c, le.size()));
    F[] data = (F[]) (Array.newInstance(c, le.size()));
    for (int i = 0; i < data.length; i++) {
      data[i] = le.get(i);
    }
    return data;
  }

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Fred", "Jim", "Sheila");
//    String[] sa = getAsArray(names, String.class);
    Object[] sa = getAsArray(names, Object.class);

    List<StringBuilder> lsb = Arrays.asList(new StringBuilder("Alan"));

//    for (String s : sa) {
    for (Object s : sa) {
      System.out.println("> " + s);
    }
    System.out.println("Type of array is " + sa.getClass().getName());
  }
}
