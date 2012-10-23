package _01_bindings._02_annotations;

import _01_bindings._02_annotations.interfaces.BillingService;
import _01_bindings._02_annotations.modules.BillingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.Test;

public class TestBindingAnnotations {
  
  @Test
  public void TestPayPalAnnotation() {
    Injector injector = Guice.createInjector(new BillingModule());
    BillingService realBillingService = injector.getInstance(BillingService.class);
    realBillingService.processBill();
}
  
//  @Test
//  public void TestGoogleAnnotation() {
//    Injector injector = Guice.createInjector(new BillingModule());
//    BillingService semiRealBillingService = injector.getInstance(BillingService.class);
//    semiRealBillingService.processBill();
//  }
  
}