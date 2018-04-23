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
public class CoatchEmployee extends Employee implements coatch{
    private Course[] course;
    private int Allcours;
    public CoatchEmployee(String name, String ID, int exp, int level, double hours, int vacation, double equ,  Course[] course) {
        super(name, ID, exp, level, hours, vacation, equ);
       this.course=course;
        Allcours=course.length;
        
    }

    @Override
    public double salary() {
       double Allprice=0;
       for (int i=0;i<course.length;i++){
           Allprice+=course[i].getPrice();
       }
       double salary=(Allprice*0.50)*26;
        super.setSalary(salary);
        return salary;
    }

    @Override
    public int donecourse(int courseDone) {
         return Allcours-courseDone;
    }
  
   
  

    
    
}
