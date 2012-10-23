package _01_bindings._02_annotations.impls;

import _01_bindings._02_annotations.interfaces.CreditCardProcessor;

public class GoogleCreditCardProcessor implements CreditCardProcessor {
  
  public void process() {
    System.out.println("Google is processing the credit card.");
  }
  
}