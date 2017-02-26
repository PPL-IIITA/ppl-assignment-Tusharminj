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
public class Girl {
    
    
    int id;
       String name;
     //   int namenum = ran.nextInt(50) + 1;
   
    int maintenance;
    int attractiveness;
    int intelligence;
    int single = 1;
    
    int choosy=0;
    int normal=0;
    int desperate=0;
    int decider;
    int happiness;
    
    
    
    
    
    
    
    Girl(String name,int  attractiveness,int maintenance,int  intelligence,int decider){
        this.name=name;
            this.attractiveness=attractiveness;
            this.maintenance=maintenance;
            this.intelligence=intelligence;
            this.decider=decider;
            
        
        
        
        
     
         if(decider==1)
             choosy=1;
         
         if(decider==2)
             normal=1;
         
         if(decider==3)
             desperate=1;
         
     
     
    }
}
