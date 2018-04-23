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
public abstract class Employee {
    private String name;
    private String ID;
    private int exp;
    private int level;
    private double hours;
    private int vacation;
    private double equ;
    private double salary;

    public Employee(String name, String ID, int exp, int level, double hours,int vacation,double equ) {
        this.name = name;
        this.ID = ID;
        this.exp = exp;
        this.level = level;
        this.hours = hours;
        this.vacation=vacation;
        this.equ=equ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public double getEqu() {
        return equ;
    }

    public void setEqu(double equ) {
        this.equ = equ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
     public void vacations(int day) {
        int vaca=getVacation()-day;
       if(vaca<=30&& vaca>=0){
          setVacation(vaca);
          
       }
       else{
           double days=getHours()* 25;
           double allDay=day*days;
           double vacat=allDay*0.05;
           double salary=getSalary()-vacat;
          setSalary(salary);
          
       }
    }
   
    
    
    
}
