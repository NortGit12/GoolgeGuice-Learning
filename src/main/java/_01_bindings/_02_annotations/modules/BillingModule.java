package _01_bindings._02_annotations.modules;

import _01_bindings._02_annotations.annotations.GoogleCC;
import _01_bindings._02_annotations.annotations.PayPalCC;
import _01_bindings._02_annotations.impls.DatabaseTransactionLog;
import _01_bindings._02_annotations.impls.GoogleCreditCardProcessor;
import _01_bindings._02_annotations.impls.PayPalCreditCardProcessor;
import _01_bindings._02_annotations.impls.RealBillingService;
import _01_bindings._02_annotations.interfaces.BillingService;
import _01_bindings._02_annotations.interfaces.CreditCardProcessor;
import _01_bindings._02_annotations.interfaces.TransactionLog;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BillingModule extends AbstractModule {
  
  public void configure() {
    bind(TransactionLog.class).to(DatabaseTransactionLog.class);
    bind(BillingService.class).to(RealBillingService.class);
//    bind(BillingService.class).to(SemiRealBillingService.class);
    bind(CreditCardProcessor.class).annotatedWith(PayPalCC.class).to(PayPalCreditCardProcessor.class);
    bind(CreditCardProcessor.class).annotatedWith(GoogleCC.class).to(GoogleCreditCardProcessor.class);
    bind(CreditCardProcessor.class).annotatedWith(Names.named("Checkout")).to(PayPalCreditCardProcessor.class);
  }
  
}