package com.promineotech.application;

import java.util.NoSuchElementException;
import java.util.Optional;
import com.promineotech.entity.Beers;

public class Question3 {

  
  public static void main(String[] args) {
    beerMethodB();
    
  }
  public static Beers beerMethodA(Optional<Beers> optionalBeer) {
    return optionalBeer.orElseThrow (()-> new NoSuchElementException("Unable To Find Beer!"));
  }  
  
  public static void beerMethodB() {
    Optional<Beers> beers = Optional.of(Beers.listOfBeers.get(0));
    System.out.println(beerMethodA(beers));
    
    try {
      beerMethodA(beers.empty());
    }
    catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
  }
}
