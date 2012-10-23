package _01_bindings._01_linked;

import _01_bindings._01_linked.interfaces.TransactionLog;
import _01_bindings._01_linked.modules.BillingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.Test;

public class TestLinkedBinding {
  
  @Test
  public void TestIt() {
    Injector billingInjector = Guice.createInjector(new BillingModule());
    
    /*
     * The getInstance() method will return an instance of the interface NOT the
     * concrete class.  It's like "Animal myDog = new Dog();" when the Dog class
     * implements the Animal interface.
     */
    TransactionLog dbTransLog = billingInjector.getInstance(TransactionLog.class);
    dbTransLog.Log();
    
  }
  
}