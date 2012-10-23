package _01_bindings._04_AtProvides.modules;

import _01_bindings._04_AtProvides.impls.DatabaseTransactionLog;
import _01_bindings._04_AtProvides.interfaces.TransactionLog;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class BillingModule extends AbstractModule {
  
  public void configure() {
  }
  
  @Provides
  public TransactionLog provideTransactionLog() {
    DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
    transactionLog.setJdbcUrl("Most bestest URL ever.");
    transactionLog.setThreadPoolSize(10);
    return transactionLog;
  }
  
}