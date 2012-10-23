package _01_bindings._01_linked.impls;

import _01_bindings._01_linked.interfaces.TransactionLog;

public class DatabaseTransactionLog implements TransactionLog {
  
  public void Log() {
    System.out.println("Logging important database stuff ;)");
  }
  
}