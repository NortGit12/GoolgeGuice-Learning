package _01_bindings._07_Constructor.modules;

import _01_bindings._07_Constructor.impls.DatabaseConnection;
import _01_bindings._07_Constructor.impls.DatabaseTransactionLog;
import _01_bindings._07_Constructor.interfaces.TransactionLog;
import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {
  
  @Override
  public void configure() {
    try {
      bind(TransactionLog.class).toConstructor(DatabaseTransactionLog.class.getConstructor(DatabaseConnection.class));
    } catch (NoSuchMethodException e) {
      addError(e);
    }
  }
  
}