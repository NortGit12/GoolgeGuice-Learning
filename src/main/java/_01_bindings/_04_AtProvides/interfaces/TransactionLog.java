package _01_bindings._04_AtProvides.interfaces;

public interface TransactionLog {
  
  public void setJdbcUrl(String jdbcUrl);
  
  public void setThreadPoolSize(Integer threadPoolSize);
  
}