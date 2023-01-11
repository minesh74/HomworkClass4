package sum_Calculator;
/*Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
        names firstNumber and secondNumber both of type double.
        Write the following methods(instance methods):
        ● Method named getFirstNumber without any parameters, it needsto return the value of the
        firstNumber field.
        ● Method named getSecondNumber without any parameters, it needs to return the value of
        the secondNumber field.
        ● Method named setFirstNumber with one parameter oftype double, it needsto set the value
        of the firstNumber field.
        ● *Method named setSecondNumber with one parameter oftype double, it needsto set the
        value of the secondNumber field.
        ● Method named getAdditionResult without any parameters, it needsto return the result of
        adding the field values of firstNumber and secondNumber.
        ● Method named getSubtractionResult without any parameters, it needsto return the result of
        subtracting the field values of the secondNumber from the firstNumber.
        ● Method named getMultiplicationResult without any parameters, it needsto return the result
        of multiplying the field values of firstNumber and secondNumber.
        ● Method named getDivisionResult without any parameters, it needsto return the result of
        dividing the field values of firstNumber by the secondNumber. In case the value of
        secondNumber is 0 then return 0.*/
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }
    public void  setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
         return firstNumber + secondNumber;

    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;

    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if (secondNumber==0){
            return 0;
        }
        return firstNumber / secondNumber;
    }
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
