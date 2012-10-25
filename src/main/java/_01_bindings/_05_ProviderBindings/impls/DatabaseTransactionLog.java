package _01_bindings._05_ProviderBindings.impls;

import _01_bindings._05_ProviderBindings.interfaces.TransactionLog;
import com.google.inject.Inject;
import java.sql.Connection;

public class DatabaseTransactionLog implements TransactionLog {
  
  private Connection connection;
  
  @Inject
  public DatabaseTransactionLog() {
    
  }
  
  public void Log() {
    System.out.println("DatabaseTransactionLog is logging important database stuff.");
  }

  void setConnection(Connection connection) {
    this.connection = connection;
    System.out.println("Just set the database connection in DatabaseTransactionLog.");
  }
  
}