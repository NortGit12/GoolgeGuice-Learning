package _01_bindings._06_Untargeted.impls;

import com.google.inject.Inject;

public class MyConcreteClass {
  
  @Inject
  public MyConcreteClass() {
    System.out.println("Just created an awesome MyConcreteClass instance.");
  }
  
  public void greet() {
    System.out.println("Hello, from a MyConcreteClass instance.");
  }
  
}