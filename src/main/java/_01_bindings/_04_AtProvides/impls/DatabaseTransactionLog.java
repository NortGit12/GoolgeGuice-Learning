package _01_bindings._04_AtProvides.impls;

import _01_bindings._04_AtProvides.interfaces.TransactionLog;

public class DatabaseTransactionLog implements TransactionLog {
  
  private String jdbcUrl;
  private Integer threadPoolSize;
  
  public DatabaseTransactionLog() {
    
  }
  
  public void setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
  }
  
  public void setThreadPoolSize(Integer threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
  }
  
  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("DatabaseTransactionLog details:\n");
    result.append("\tjdbcUrl = >>>" + this.jdbcUrl + "<<<\n");
    result.append("\tthreadPoolSize = >>>" + this.threadPoolSize + "<<<\n");
    return result.toString();
  }
  
}