package _01_bindings._02_annotations.impls;

import _01_bindings._02_annotations.annotations.GoogleCC;
import _01_bindings._02_annotations.annotations.PayPalCC;
import _01_bindings._02_annotations.interfaces.BillingService;
import _01_bindings._02_annotations.interfaces.CreditCardProcessor;
import _01_bindings._02_annotations.interfaces.TransactionLog;
import com.google.inject.Inject;

public class RealBillingService implements BillingService {
  
  private CreditCardProcessor processor;
  
  @Inject
  public RealBillingService (@PayPalCC CreditCardProcessor processor, TransactionLog transactionLog) {
//  public RealBillingService (@GoogleCC CreditCardProcessor processor, TransactionLog transactionLog) {
//  public RealBillingService (@Named("Checkout") CreditCardProcessor processor, TransactionLog transactionLog) {
    this.processor = processor;
  }
  
  public void processBill() {
    if(processor instanceof PayPalCreditCardProcessor) {
      System.out.println("RealBillingService, with the @PayPalCC annotation, is processing the bill.");
    }
    else if(processor instanceof GoogleCreditCardProcessor) {
      System.out.println("RealBillingService, with the @GoogleCC annotation, is processing the bill.");
    }
    else {
      System.out.println("RealBillingService, with the @Named(\"Checkout\") annotation, is processing the bill.");
    }
    processor.process();
  }
  
}