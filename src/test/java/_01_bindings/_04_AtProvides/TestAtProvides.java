package _01_bindings._04_AtProvides;

import _01_bindings._04_AtProvides.interfaces.TransactionLog;
import _01_bindings._04_AtProvides.modules.BillingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.Test;

public class TestAtProvides {
  
  @Test
  public void TestIt() {
    Injector billingInjector = Guice.createInjector(new BillingModule());
    TransactionLog databaseTransactionLog = billingInjector.getInstance(TransactionLog.class);
    databaseTransactionLog.setJdbcUrl("http://www.BestestSiteEver.com/coolStuff.html");
    databaseTransactionLog.setThreadPoolSize(10);
    String result = databaseTransactionLog.toString();
    System.out.println(result);
  }
  
}