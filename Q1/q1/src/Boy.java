/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Random;

/**
 *
 * @author Tushar
 */
public class Boy {
    String name;
    int spent;
    int id;
       Random ran = new Random();
    int attractiveness;
    int budget;   
    int intelligence;
    //    int namenum = ran.nextInt(50) + 1;
        int single = 1;
        
     int miser=0;
     int generous =0;
     int geek=0;
        int decider;
        int happiness;
        
        
        Boy(String name,int attractiveness,int budget,int intelligence,int  decider){
         
            this.name=name;
            this.attractiveness=attractiveness;
            this.budget=budget;
            this.intelligence=intelligence;
            this.decider=decider;
            
            
            
            /*id= numbrr;
            
            
         name = "Boy " + Integer.toString(id);
             int id;
       Random ran = new Random();
    attractiveness = ran.nextInt(10) + 1;
    budget = ran.nextInt(100) + 1;   
    intelligence = ran.nextInt(10) + 1;
    */
        
          
         if(decider==1){
             miser=1;
             
             
             
         }
         
         
         if(decider==2){
             generous=1;
             
             
         }
         
         
         if(decider==3){
             geek=1;
             
             
         }
    
        }
       
        
        
        
        
        
}
