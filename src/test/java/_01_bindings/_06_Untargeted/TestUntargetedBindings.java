package _01_bindings._06_Untargeted;

import _01_bindings._06_Untargeted.impls.AnotherConcreteClass;
import _01_bindings._06_Untargeted.impls.MyConcreteClass;
import _01_bindings._06_Untargeted.modules.MyModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import org.testng.annotations.Test;

public class TestUntargetedBindings {
  
  @Inject
    @Named("foo")
    public MyConcreteClass myConcreteClass02;
//  @Inject
//    @Named("foo")
//    public AnotherConcreteClass myAnotherConcreteClass02;
  
  @Test
  public void TestIt() {
    Injector myInjector = Guice.createInjector(new MyModule());
    
    System.out.println("Working with basic untargeted bindings");
    
    MyConcreteClass myConcreteClass01 = myInjector.getInstance(MyConcreteClass.class);
    myConcreteClass01.greet();
    AnotherConcreteClass myAnotherConcreteClass01 = myInjector.getInstance(AnotherConcreteClass.class);
    myAnotherConcreteClass01.greet();
    
    System.out.println("Now working with the annotations");
    
    //MyConcreteClass myConcreteClass02 = myInjector.getInstance(MyConcreteClass.class);
    myConcreteClass02.greet();
    AnotherConcreteClass myAnotherConcreteClass02 = myInjector.getInstance(AnotherConcreteClass.class);
    myAnotherConcreteClass02.greet();
  }
  
}