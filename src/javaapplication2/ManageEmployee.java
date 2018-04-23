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
public class ManageEmployee extends Employee implements coluc {
  
    public ManageEmployee(String name, String ID, int exp, int level, double hours,int vacation,double equ) {
        super(name, ID, exp, level, hours,vacation,equ);
    }

    @Override
    public double salary() {
        double day=25*getHours();
        double month=day*26;
        super.setSalary(month);
        return month;
    }

    @Override
    public void gread() {
     
       if(getExp()%3==0&& getEqu()>=70){
           int level=getLevel();
           setLevel(++level);
           
       }
       
    }
    }
    
    
    

