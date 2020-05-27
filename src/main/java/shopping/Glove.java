package shopping;

public class Glove implements Sized, Colored {
  private String color;
  private int size;

  public Glove(String color, int size) {
    this.color = color;
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "Glove{" +
        "color='" + color + '\'' +
        ", size=" + size +
        '}';
  }

}
