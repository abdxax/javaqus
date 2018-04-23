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
public class Course {
    private String nameCourse;
    private int Days;
    private double price;

    public Course(String nameCourse, int Days, double price) {
        this.nameCourse = nameCourse;
        this.Days = Days;
        this.price = price;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }


    public int getDays() {
        return Days;
    }

    public void setDays(int Days) {
        this.Days = Days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double priceCource(){
      return Days*price;
    }
    
}
