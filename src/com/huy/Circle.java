package com.huy;

public class Circle {
    private double radius;
    private String color;
    private Boolean filled;

    public Circle(){
    }

    public Circle (double radius, String color, Boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled =filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
