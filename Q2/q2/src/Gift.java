/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.Random;

/**
 *
 * @author Tushar
 */
public class Gift {
    String category;
    int value;
    int price;
        int decider;
    Random ran = new Random();
    
    Gift(){
        
    value = ran.nextInt(100) + 1;
    price = ran.nextInt(100) + 1;
    
 
  
    
    if(decider==1)
    {
    category="Essential";
   
    }
    
    if(decider==2){
        
        category ="Luxury";
        int luxury_rating = ran.nextInt(10) + 1;
        int difficulty = ran.nextInt(10) + 1;
        
    }
    
    if(decider ==3 ){
        
        category= "Utility";
        
       int utility_class = ran.nextInt(100) + 1;
       int utility_value = ran.nextInt(100) + 1;
        
        
    }
    
    
    
    
    
}
    
    
    
    
}