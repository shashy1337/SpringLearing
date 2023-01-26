package ru.shashy.springlearn.AbstractsUsingWithContext.TestByClean;

public class DeliveryDetailsPrinter {

  private final Sorter sorter;

  public DeliveryDetailsPrinter(Sorter sorter){
      this.sorter = sorter;
  }

    public void printDetails() {
      sorter.sortDetails();
  }

}