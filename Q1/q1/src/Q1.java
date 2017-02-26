/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author Tushar
 */
public class Q1 {

    int boynum;
    int girlnum;
    int somenum;

    
     ArrayList<Boy> boylist = new ArrayList<>();

    
        ArrayList<Girl> girllist = new ArrayList<>();

        ArrayList<Couple> couplelist = new ArrayList<Couple>();


    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Q1 q2 = new Q1();
      

 
        q2.gogo();

        // System.out.println("Finish");
    } // main

    public void girl_generator() throws IOException {
        String name;
        File file = new File("girl.txt");
        file.createNewFile();
        FileWriter filewriter = new FileWriter(file);

        Random ran = new Random();
        //girlnum = ran.nextInt(50) + 1;
//        System.out.println(girlnum);

        //  somenum = ran.nextInt(50) + 1;
        int i;
         //boynum = girlnum + somenum;
        for (i = 0; i < girlnum; i++) {
            int id = i;

            int attractiveness = ran.nextInt(10) + 1;
            int maintenance = ran.nextInt(100) + 1;
            int intelligence = ran.nextInt(10) + 1;
            //    int namenum = ran.nextInt(50) + 1;

            int decider = 0;

            name = "Girl " + Integer.toString(i);

            attractiveness = ran.nextInt(10) + 1;
            maintenance = ran.nextInt(100) + 1;
            intelligence = ran.nextInt(10) + 1;

            decider = ran.nextInt(3) + 1;
            /*
         if(decider==1){
             miser=1;
             
             
             
         }
         
         
         if(decider==2){
             generous=1;
             
             
         }
         
         
         if(decider==3){
             geek=1;
             
           
         }
             */
            filewriter.write(name + "," + attractiveness + "," + maintenance + "," + intelligence + "," + decider + "\n");
            //filewriter.flush();
            //filewriter.write(attractiveness);

            filewriter.flush();

        }
    }

    public void boy_generator() throws IOException {
        String name;
        File file = new File("boy.txt");
        file.createNewFile();
        FileWriter filewriter = new FileWriter(file);

        Random ran = new Random();
       // girlnum = ran.nextInt(50) + 1;
        //System.out.println(girlnum);

       // somenum = ran.nextInt(50) + 1;
        int i;
       // boynum = girlnum + somenum;
        for (i = 0; i < boynum; i++) {
            int id = i;

            int attractiveness = ran.nextInt(10) + 1;
            int budget = ran.nextInt(100) + 1;
            int intelligence = ran.nextInt(10) + 1;
            //    int namenum = ran.nextInt(50) + 1;

            int miser = 0;
            int generous = 0;
            int geek = 0;
            int decider = 0;

            name = "Boy " + Integer.toString(i);

            attractiveness = ran.nextInt(10) + 1;
            budget = ran.nextInt(100) + 1;
            intelligence = ran.nextInt(10) + 1;

            decider = ran.nextInt(3) + 1;

            if (decider == 1) {
                miser = 1;

            }

            if (decider == 2) {
                generous = 1;

            }

            if (decider == 3) {
                geek = 1;

            }
            filewriter.write(name + "," + attractiveness + "," + budget + "," + intelligence + "," + decider + "\n");
            //filewriter.flush();
            //filewriter.write(attractiveness);

            filewriter.flush();

        }
    }

    public void gogo() throws IOException {

        int k, l;
        int count = 0;
        int j;
        int i;
        //   int boynum;
        // int girlnum;
        ///int somenum;

        Random ran = new Random();

         girlnum = ran.nextInt(50) + 1;
        //System.out.println(girlnum);
         somenum = ran.nextInt(50) + 1;
         boynum = girlnum + somenum;
         
         
         this.girl_generator();
         this.boy_generator();
         
        
         this.getgirl();
         this.getboy();
        // System.out.println(boynum);
       // ArrayList<Boy> boylist = new ArrayList<>();

        /*  for (i = 0; i < boynum; i++) {

            Boy b = new Boy();
            boylist.add(b);
            //System.out.println(i);
            //  System.out.println(b.name);
        }
         */
        //ArrayList<Girl> girllist = new ArrayList<>();

        //ArrayList<Couple> couplelist = new ArrayList<Couple>();

        /*  for (i = 0; i < girlnum; i++) {

            Girl g = new Girl(i);
            girllist.add(g);s

        }
         */
        for (i = 0; i < girlnum; i++) {
            Girl x = girllist.get(i);
            for (j = 0; j < boynum; j++) {

                Boy y = boylist.get(j);
                // System.out.printf(y.name);

                if ((x.maintenance < y.budget) && x.single == 1 && 1 == y.single) {

                    Couple c = new Couple(y, x);
                    couplelist.add(c);
                    x.single = 0;
                    y.single = 0;

                    break;
                }
            }

        }
         File file = new File("couple.txt");
        file.createNewFile();
        FileWriter filewriter = new FileWriter(file);

        filewriter.write("couples : \n");
       // System.out.println(couplelist.size());
        for (i = 0; i < couplelist.size(); i++) {
                 Timestamp ts = new Timestamp(System.currentTimeMillis());
            //fileWriter.write(ts + ": Gift Given :\n" + minGift.toString() + "\n");
            //fileWriter.flush();
            filewriter.write("Couple name: " + couplelist.get(i).Couplename +"\tTimeStamp: "+ts+ " \n");

            filewriter.flush();
            // System.out.println(couplelist.get(i).Couplename);

        }
        // System.out.println("Finish");
        // GIFTS

     

        /*   for(i=0;i<1000;i++){
                 
                 for(j=0;j<1000-i;j++){
                     
                     if(giftlist.get(j).price > giftlist.get(j+1).price){
                        Collections.swap(giftlist,j,j+1);
                     }
                     
                 }
                 
                 
                 
             }   // gift sorting
             
         */
        //GIFTS OVER 
        //System.out.println("Finish");
        
        //   File file1 = new File("couple.txt");
        // BufferedReader bufferedreader = new BufferedReader(new FileReader(file1));
        //    System.out.println(bufferedreader.readLine());

    }

    public void getgirl() throws FileNotFoundException, IOException {

        String name;
        int attractiveness;
        int maintenance;
        int intelligence;
        String type;
        int decider;
        

        File file = new File("girl.txt");
        BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedreader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ",");
            name = st.nextToken();
            attractiveness = Integer.parseInt(st.nextToken());
            maintenance = (int) Double.parseDouble(st.nextToken());
            intelligence = Integer.parseInt(st.nextToken());
            decider = Integer.parseInt(st.nextToken());
            girllist.add(new Girl(name, attractiveness, maintenance, intelligence, decider));
            //System.out.println(girllist.get(0));
        }
        bufferedreader.close();

    }

    public void getboy() throws FileNotFoundException, IOException {

        String name;
        int attractiveness;
        int budget;
        int intelligence;
        String type;
        int decider;
        

        File file = new File("boy.txt");
        BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedreader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ",");
            name = st.nextToken();
            attractiveness = Integer.parseInt(st.nextToken());
            budget = (int) Double.parseDouble(st.nextToken());
            intelligence = Integer.parseInt(st.nextToken());
            decider = Integer.parseInt(st.nextToken());
            boylist.add(new Boy(name, attractiveness, budget, intelligence, decider));
        }
        bufferedreader.close();

    }

}
