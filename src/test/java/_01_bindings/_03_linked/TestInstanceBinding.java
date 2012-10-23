package _01_bindings._03_linked;

import _01_bindings._03_instance.impls.Favorites;
import _01_bindings._03_instance.modules.InstanceModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import org.testng.annotations.Test;

public class TestInstanceBinding {
  
  @Test
  public void TestIt() {
    Injector injector = Guice.createInjector(new InstanceModule());
    Favorites myFavorites = injector.getInstance(Favorites.class);
    
    String result = myFavorites.toString();
    System.out.println(result);
  }
  
}