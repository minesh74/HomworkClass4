package groupArray;

import java.util.ArrayList;

/*Write a Java program to test an array list is empty or not. Define array list with
        underground tube names */
public class Array_Tube_Empty {
    public static void main(String[] args) {
        ArrayList<String> tubes = new ArrayList<>();  //Creating new Arraylist

        tubes.add("Hemmersmith & City Line");   //Adding tube names to list
        tubes.add("District Line");
        tubes.add("Circle Line");
        tubes.add("Jubilee Line");
        tubes.add("Cenral Line");
        tubes.add("Victoria Line");
        tubes.add("Metropolitan Line");
        tubes.add("Elizabeth Line");
        tubes.add("Piccadily Line");
        tubes.add("Bakerloo Line");

        if (tubes.isEmpty()) {
            System.out.println("List of Tubes is Empty");
        } else {
            System.out.println("List of Tubes is not Empty");
        }
    }
}