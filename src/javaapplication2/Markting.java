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
public class Markting extends Employee implements coluc{
   Course [] course;
    int sales;
    public Markting(String name, String ID, int exp, int level, double hours, int vacation, double equ,Course [] course  ) {
        super(name, ID, exp, level, hours, vacation, equ);
        
        this.course= course ;
        this.sales=course.length;
    }

    public double bouns (){
       int cour=0;
       int days=0;
       double bouns[]=new double[course.length];
      for (int i=0;i<course.length;i++){
         bouns[i]=(course[i].getPrice()*course[i].getDays())*0.25;
         cour+=bouns[i];
      }
      return cour;
    }
    @Override
    public double salary() {
       double day=25*getHours();
        double month=day*26;
        double salary=month+bouns();
       setSalary(salary);
       return salary;
    }

    @Override
    public void gread() {
        if(getExp()%3==0&& getEqu()>=70&& sales>=500){
           int level=getLevel();
           setLevel(++level);
           
       }
    }

   
    
}
