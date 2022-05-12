package com.promineotech.sort;

import java.util.List;
import com.promineotech.entity.Beers;


public class BeerSort {
  
  public static List<Beers> sortBeersByLambda(List<Beers> listOfBeers){
     
    listOfBeers.sort((b1, b2) -> Beers.compare(b1, b2));
    return listOfBeers;
  }
  
  public List<Beers> sortBeersByMethodReference (List<Beers> listOfBeers){

    listOfBeers.sort(Beers :: compare);
    return listOfBeers;
    
  }
}
