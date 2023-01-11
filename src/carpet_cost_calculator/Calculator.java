package carpet_cost_calculator;
       /*Write a class with the name Calculator. The class needstwo fields(instance variables) with name
        floor of type Floor and carpet of type Carpet.
        The class needsto have one constructor with parameters floor of type Floor and carpet of type Carpet
        and it needsto initialize the fields.
        Write the following methods(instance methods):
        ● Method named getTotalCost without any parameters, it needsto return the calculated total
        cost to cover the floor with a carpet. */
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //getTotalCost method that returns the total cost to cover the floor with the carpet by multiplying the area of the floor by the cost of the carpet.
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

