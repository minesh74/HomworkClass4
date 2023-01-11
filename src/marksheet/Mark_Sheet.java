package marksheet;

import java.util.Scanner;

//Re write the student mark sheet program using if else and while loop.
public class Mark_Sheet {
public static void main(String[] args){
     Scanner sc =new Scanner(System.in);  //CREAT SCANNER CLASS OBJECT
     int sum;

     System.out.println("Enter Student Name :");
     String name=sc.nextLine();
     System.out.println("Enter Roll No. :");
     String rollNo=sc.nextLine();

     System.out.println("Enter Marks for Math,Science and English between (0-100) :");
     int math=sc.nextInt();
     int science=sc.nextInt();
     int english=sc.nextInt();

     while (math < 0 || math > 100 || science < 0 || science > 100 || english < 0 || english > 100 ) {
          System.out.println("Invalid Input, Marks should be between 0 and 100"); //validate correct input
          System.out.println("Enter Marks for Math, Science, English"); // tell user to enter inputs per subject

          //store data per input
          math = sc.nextInt();
          science = sc.nextInt();
          english = sc.nextInt();
     }
          //Calculate total Marks and Percentage

          // to find out student is Pass or Fail

             //print the Marksheet
     int total = 300;
     sum = math + science + english;
     float per = sum* 100 / total;
     String result ="";
     String grade ="";
     if (per >= 80) {
          grade = "A+";
          result = "PASS";
     } else if (per >= 60) {
          grade = "A";
          result = "PASS";
     } else if (per >= 50) {
          grade = "B";
          result = "PASS";
     } else if (per >= 35) {
          grade = "C";
          result = "PASS";
     } else {
          grade = "FAIL";
          result = "FAIL";
     }
          System.out.println("|------------------------------|");
          System.out.println("|--------MARKSHEET-------------|");
          System.out.println("|------------------------------|");
          System.out.println("|  NAME            "+name+"    |");
          System.out.println("|  Roll No.        "+rollNo+"    |");
          System.out.println("|------------------------------|");
          System.out.println("|  Subject           Marks     |");
          System.out.println("|------------------------------|");
          System.out.println("|    Maths          "+math+"   |");
          System.out.println("|    Sceince        "+science+"|");
          System.out.println("|    English        "+english+"|");
          System.out.println("|------------------------------|");
          System.out.println("|    Total      :   "+total+"    |");
          System.out.println("|------------------------------|");
          System.out.println("|    Percentage :   "+per+"    |");
          System.out.println("|    Result     :   "+result+" |");
          System.out.println("|    Grade      :   "+grade+"  |");
          System.out.println("|------------------------------|");

     }
     }


















