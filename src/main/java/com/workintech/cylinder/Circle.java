package com.workintech.cylinder;

public class Circle {
    private double radius;

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public Circle(double radius){
        this.radius= radius<0 ? 0: radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
