package com.promineotech.application;

import java.util.stream.Collectors;
import com.promineotech.entity.Beers;


public class Question2 {

  public static void main(String[] args) {
   
    String printSortedBeerList = Beers.listOfBeers.stream().map(Beers -> Beers.toString()).sorted().collect(Collectors.joining(","));
    
    System.out.println(printSortedBeerList);
    
  } 
}
