package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return 2 * radius;
    }


    public double getRadius() {
        // adding a getter for radius (need it in testing)
        return radius;
    }
    
}
