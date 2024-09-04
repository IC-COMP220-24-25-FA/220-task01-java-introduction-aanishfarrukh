package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double width;
    private double length;
    

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double calcArea(){
       return width * length;
    }

    public void doubleSize(){
        this.width *= 2;
        this.length *= 2;
    }

    public double longestLineWithin(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }
    

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }



}
