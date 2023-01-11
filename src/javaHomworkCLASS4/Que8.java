package javaHomworkCLASS4;
  /*Display left angle triangle of * using nested for loops
        *
        * *
        * * *
        * * * *
        * * * * * */
public class Que8 {
      public static void main(String[] args) {
          for (int i = 0; i < 7; i++) {
              for (int j = 0; j < i; j++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
      }

  }