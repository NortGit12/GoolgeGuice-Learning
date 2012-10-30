package _01_bindings._06_Untargeted.modules;

import _01_bindings._06_Untargeted.impls.AnotherConcreteClass;
import _01_bindings._06_Untargeted.impls.MyConcreteClass;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class MyModule extends AbstractModule {
  
  @Override
  public void configure() {
    // Without annotations
    bind(MyConcreteClass.class);
    bind(AnotherConcreteClass.class).in(Singleton.class);
    
    // With annotations
    bind(MyConcreteClass.class).annotatedWith(Names.named("foo")).to(MyConcreteClass.class);
    bind(AnotherConcreteClass.class).annotatedWith(Names.named("foo")).to(AnotherConcreteClass.class).in(Singleton.class);
  }
  
}