package coandcontra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxAccount {
  public static void doTaxes(Taxable t) {
  }

  // ? extends Blah is generally Java's way of expressing
  // Co-variance
  public static void doBulkTaxes(List<? extends Taxable> lt) {
//    lt.add(new Corporation());
//    lt.add(new Taxable());
    for (Taxable t : lt) {
      doTaxes(t);
    }
  }

  public static void doBulkTaxes(Taxable[] lt) {
    lt[0] = new Corporation();
    lt[1] = new Taxable();
    for (Taxable t : lt) {
      doTaxes(t);
    }
  }

  // "contra-variance"
  public static void collectIndividualClients(List<? super Individual> li) {
//    Individual i = li.get(0); NOT ALLOWED...
    li.add(new Individual());
  }

  public static void main(String[] args) {
    List<Taxable> lt = new ArrayList<>();

    lt.add(new Individual());
    lt.add(new Corporation());
    lt.add(new Individual());

    doTaxes(new Individual());

    Individual[] indArray = {new Individual()};
    doBulkTaxes(lt);

    List<Individual> jimsClients =
        new ArrayList<>(Arrays.asList(new Individual()));
    doBulkTaxes(jimsClients);
    System.out.println("About to process array");
    doBulkTaxes(indArray);
    System.out.println("Back from array...");

    List<Corporation> lc = Arrays.asList(new Corporation());
    doBulkTaxes(lc);

    List<Taxable> ltx = Arrays.asList(new Corporation());
    doBulkTaxes(ltx);

    collectIndividualClients(lt);
  }
}
