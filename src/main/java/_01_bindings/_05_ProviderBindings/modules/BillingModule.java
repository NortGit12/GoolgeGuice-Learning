package _01_bindings._05_ProviderBindings.modules;

import _01_bindings._05_ProviderBindings.impls.DatabaseTransactionLogProvider;
import _01_bindings._05_ProviderBindings.impls.MyConnection;
import _01_bindings._05_ProviderBindings.interfaces.TransactionLog;
import com.google.inject.AbstractModule;
import java.sql.Connection;

public class BillingModule extends AbstractModule {
  
  @Override
  protected void configure() {
    bind(Connection.class).to(MyConnection.class);
    bind(TransactionLog.class).toProvider(DatabaseTransactionLogProvider.class);
  }
  
}