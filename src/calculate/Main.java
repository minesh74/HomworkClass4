package calculate;
import java.util.Scanner;
/*Create one package with name calculate
        2. Create two class with name “Calculator” and “Main”
        3. Create four methods with manes “addition”, “subtraction”, “division”,
        and “multiplication”. All methods are instance method and it doesn’t
        return anything. But it has two parameters with name “int a” and “int
        b”. Also each method have System.out.println(). This prints the result.
        Also create all one more method with name “calculateResult” with
        three parameter with name int a, int b and char symbol. Write the logic
        in calculateResult method that when user enter first number and
        second number and symbol based on symbol it does calculate.
        4. Write a “main” method into main class. It has scanner that takes user
        input. Also write the logic that it ask user to “Enter first Number:”,
        “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
        enter + symbol result like “Addition of 5 and 10 is: 15” and respective
        for other symbol.
        5. With the result it’s also print one more message “Would you like to do
        more calculation Please enter “Y” or “N” :” (Hint use while loop if user
        enter Y program asking the user to enter First Number, and if user enter
        N program should terminate)*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        char choice;
        do {
            // Ask user to enter first number
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            // Ask user to enter second number
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Ask user to enter a symbol
            System.out.print("Please enter one of the symbols +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            // Perform the calculation based on the symbol provided
            calculator.calculateResult(a, b, symbol);

            // Ask user if they want to do more calculations
            System.out.print("Would you like to do more calculations? Please enter Y or N: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Close the scanner
        scanner.close();
    }
}

