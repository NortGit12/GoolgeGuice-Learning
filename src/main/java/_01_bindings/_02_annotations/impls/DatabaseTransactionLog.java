package _01_bindings._02_annotations.impls;

import _01_bindings._02_annotations.interfaces.TransactionLog;

public class DatabaseTransactionLog implements TransactionLog {
  
  public void Log() {
    System.out.println("Logging important database stuff ;)");
  }
  
}