package groupArray;

import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in an array list using
        Iterator.*/
public class Array_Iterate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();  //Creating Arraylist of Integer
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        Iterator<Integer> iterator = numbers.iterator();  //calling Iterator for list

        while (iterator.hasNext()) {
            int number = iterator.next();
        }
        for (int number : numbers){
            System.out.println(number);
        }
    }
}