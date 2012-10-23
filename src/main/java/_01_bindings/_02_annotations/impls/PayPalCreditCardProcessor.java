package _01_bindings._02_annotations.impls;

import _01_bindings._02_annotations.interfaces.CreditCardProcessor;

public class PayPalCreditCardProcessor implements CreditCardProcessor {
  
  public void process() {
    System.out.println("PayPal is processing the credit card.");
  }
  
}