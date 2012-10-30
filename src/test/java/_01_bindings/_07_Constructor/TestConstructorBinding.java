package _01_bindings._07_Constructor;

import _01_bindings._07_Constructor.interfaces.TransactionLog;
import _01_bindings._07_Constructor.modules.BillingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.Test;

public class TestConstructorBinding {
  
  @Test
  public void TestIt() {
    Injector billingInjector = Guice.createInjector(new BillingModule());
    TransactionLog databaseTransactionLog = billingInjector.getInstance(TransactionLog.class);
    
    databaseTransactionLog.LogIt();
  }
  
}