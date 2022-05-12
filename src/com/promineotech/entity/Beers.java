package com.promineotech.entity;

import java.util.Arrays;
import java.util.List;

public class Beers {
  
  private String name;
  
  public Beers(String name) {
    this.setName(name); 
 }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return (this.getName() + " ABV");
  }
  
  public static int compare(Beers b1, Beers b2) {
    return b1.getName().compareTo(b2.getName());
    
  }
  
  public static List<Beers> listOfBeers = Arrays.asList(new Beers ("La Cumbre Elevated IPA " + " " + "7.2%"),
      new Beers ("Odell IPA"+ " " + "7%" ),
      new Beers ("Firestone Walker Mind Haze IPA" + " " + "6.2%"),
      new Beers ("Elysian Space Dust IPA " + " " + "8.2%"),
      new Beers ("Ex Novo Mass Ascension IPA"+ " " + "6.9%")); 
  
}