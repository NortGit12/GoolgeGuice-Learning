package _01_bindings._03_instance.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class InstanceModule extends AbstractModule {
  
  public void configure() {
    bind(String.class).annotatedWith(Names.named("FAVORITE DESSERT")).toInstance("cheesecake");
    bind(Integer.class).annotatedWith(Names.named("FAVORITE NUMBER")).toInstance(12);
  }
  
}