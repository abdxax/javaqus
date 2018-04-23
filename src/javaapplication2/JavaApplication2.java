/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Abdulrahman
 */

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Course [] c =new Course [2];
        c[0]=new Course ("technology",6,150);
        c[1]=new Course ("academy",4,90);
          
       CoatchEmployee co=new CoatchEmployee("Ahmad","sd1256",2,7,4,0,0,c);
       System.out.println("The salary is "+co.salary());
        System.out.println("The course is not done "+co.donecourse(1));
        
        ManageEmployee mo=new ManageEmployee("Khaled","sd4444",3,1,8,15,80);
          System.out.println("The salary is "+mo.salary());
          mo.gread();
          System.out.println("The Level is "+mo.getLevel());
          mo.vacations(7);
           System.out.println("The Vacation has   "+mo.getVacation());
           
           Markting mk=new Markting("Ali","sd5564",4,2,6,25,55,c);
           
           System.out.println("The Bouns is "+mk.bouns());
              System.out.println("The salary is "+mk.salary());
            mk.gread();
             System.out.println("The level is "+mk.getLevel());
             mk.vacations(6);
             System.out.println("The vacation is "+mk.getVacation());
        
    }
    
}
