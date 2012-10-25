package _01_bindings._05_ProviderBindings;

import _01_bindings._05_ProviderBindings.interfaces.TransactionLog;
import _01_bindings._05_ProviderBindings.modules.BillingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.Test;

public class TestProviderBindings {
  
  @Test
  public void TestIt() {
    Injector billingInjector = Guice.createInjector(new BillingModule());
    TransactionLog databaseTransactionLog = billingInjector.getInstance(TransactionLog.class);
    
    databaseTransactionLog.Log();
  }
  
}