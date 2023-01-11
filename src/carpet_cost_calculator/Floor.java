package carpet_cost_calculator;
/*1. Write a class with the name Floor. The class needstwo fields(instance variables) with name width
       and length of type double.*/

public class Floor {
    private double width;
    private double length;

    //constructor that takes width and length values as parameters and sets the instance variables to these values.
    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    //getArea method that returns the area of the floor as a double
    public double getArea() {
        return width * length;
    }
}

