/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Tushar
 */
public class Couple {
    
   Girl girly;
   Boy boyo;    
   int i;
   int j;
   int k;
   String Couplename;
   int happiness;
   int compatibility;
   ArrayList<Gift> cgiftlist = new ArrayList<>();
   Couple(Boy y,Girl x){
       boyo=y;
       girly = x; 
      
       
       
     Couplename = boyo.name +" "+ girly.name;
     // happiness = boyo.happiness + girly.happiness;
     
         
       /*  compatibility = (
                 abs(boyo.budget - girly.maintenance) 
                 + abs(boyo.attractiveness - girly.attractiveness)
                 + abs(boyo.intelligence -girly.intelligence)
                 );
         
         */
         
     }
     
     
     
         
         
         
         
         
     }
     
     
     
     
     
     
     
     
     
     
     
   
    
   
   
   
   

