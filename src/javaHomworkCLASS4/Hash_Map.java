package javaHomworkCLASS4;
import java.util.HashMap;
import java.util.Map;
        /*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/
public class Hash_Map {
            public static void main(String[] args) {
                // Create a new HashMap object called people that stores String keys and Integer values
                Map<String, Integer> people = new HashMap<>();

                // Add some entries to the map
                people.put("Minesh", 45);
                people.put("Jiten", 30);
                people.put("Maulik", 35);
                people.put("Hetvi", 30);

                // Use a for-each loop to iterate through the values in the map
                for (Integer age : people.values()) {
                    System.out.println(age);
                }

                System.out.println("\n");

                // Use a for-each loop to iterate through the keys in the map
                for (String name : people.keySet()) {
                    System.out.println(name);
                }

                System.out.println("\n");
                // Use a for-each loop to iterate through the key-value pairs in the map
                for (Map.Entry<String, Integer> entry : people.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

            }
        }

