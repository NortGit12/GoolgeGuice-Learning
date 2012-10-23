package _01_bindings._02_annotations.impls;

import _01_bindings._02_annotations.annotations.GoogleCC;
import _01_bindings._02_annotations.interfaces.BillingService;
import _01_bindings._02_annotations.interfaces.CreditCardProcessor;
import _01_bindings._02_annotations.interfaces.TransactionLog;
import com.google.inject.Inject;

public class SemiRealBillingService implements BillingService {
  
  private CreditCardProcessor processor;
  
  @Inject
  public SemiRealBillingService(@GoogleCC CreditCardProcessor processor, TransactionLog transactionLog) {
    this.processor = processor;
  }
  
  public void processBill() {
    System.out.println("SemiRealBillingService is processing the bill");
    processor.process();
  }
  
}