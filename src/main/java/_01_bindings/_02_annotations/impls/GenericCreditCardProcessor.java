package _01_bindings._02_annotations.impls;

import _01_bindings._02_annotations.interfaces.CreditCardProcessor;

public class GenericCreditCardProcessor implements CreditCardProcessor {
  
  public void process() {
    System.out.println("A generic processor is processing the credit card.");
  }
  
}