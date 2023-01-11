package groupArray;
   /*Write a Java program to create a new array list, add some colours(string) and
        printout the collection using for each loop.*/
import java.util.ArrayList;

public class Array_Colors {

    /*Write a Java program to create a new array list, add some colours(string) and
            printout the collection using for each loop.*/

        public static void main(String[] args){

            ArrayList<String> colors =new ArrayList<>();

            colors.add("White");
            colors.add("Black");
            colors.add("Pink");
            colors.add("Red");
            colors.add("Blue");
            colors.add("Orange");

            for (String color : colors){
                System.out.println(color);
            }
        }

    }

