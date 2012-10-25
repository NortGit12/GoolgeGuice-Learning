package _01_bindings._05_ProviderBindings.impls;

import _01_bindings._05_ProviderBindings.interfaces.TransactionLog;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.sql.Connection;

public class DatabaseTransactionLogProvider implements Provider<TransactionLog> {
  
  private final Connection connection;
  
  @Inject
  public DatabaseTransactionLogProvider(Connection connection) {
    this.connection = connection;
  }
  
  public TransactionLog get() {
    DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
    transactionLog.setConnection(connection);
    return transactionLog;
  }
  
}