package methodoverriding23;
//Creating Child Class
 class Bike2 extends Vehicle {
    //Defining the same method as in the Parent Class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
Bike2 obj =new Bike2();  //creating object
obj.run(); //Calling method
    }
}