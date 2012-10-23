package _01_bindings._03_instance.impls;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Favorites {
  
  @Inject
    @Named("FAVORITE DESSERT")
    String favoriteDessert;
  @Inject
    @Named("FAVORITE NUMBER")
    Integer favoriteNumber;
  
  
  public Favorites() {
    
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("My favorite dessert is " + favoriteDessert + ".\n");
    result.append("My favorite number is " + favoriteNumber + ".\n");
    return result.toString();
  }
  
}