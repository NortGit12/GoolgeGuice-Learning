package _01_bindings._07_Constructor.impls;

import _01_bindings._07_Constructor.interfaces.TransactionLog;

public class DatabaseTransactionLog implements TransactionLog {
  
  public DatabaseTransactionLog(DatabaseConnection connection) {
    System.out.println("Creating an instance of DatabaseTransactionLog");
  }
  
  public void LogIt() {
    System.out.println("Calling DatabaseTransactionLog's LogIt() method.");
  }
  
}