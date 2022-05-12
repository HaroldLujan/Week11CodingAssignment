package com.promineotech.application;

import java.util.List;
import com.promineotech.entity.Beers;
import com.promineotech.sort.BeerSort;

public class Question1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    BeerSort sortBeers = new BeerSort();
    
    List<Beers> printSortedBeerList = BeerSort.sortBeersByLambda(Beers.listOfBeers);  
    
    System.out.println(printSortedBeerList);
    
  }
    
}
