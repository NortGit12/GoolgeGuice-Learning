package _01_bindings._01_linked.modules;

import _01_bindings._01_linked.impls.DatabaseTransactionLog;
import _01_bindings._01_linked.interfaces.TransactionLog;
import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {
  
  public void configure() {
    bind(TransactionLog.class).to(DatabaseTransactionLog.class);
  }
  
}