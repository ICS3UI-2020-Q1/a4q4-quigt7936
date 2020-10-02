import java.util.Scanner;
/**
 * Gives the fizz buzz numbers up to the users number
 * @author Thomas Quigley
 */
public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // get their number
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int userNumber = input.nextInt();
   
    // declare the number it's on as a variable
    int numberTurn = 0;

    // create a while loop that stops when the number is reached
    while (numberTurn != userNumber) {
      // go onto the next number in the series
      numberTurn = numberTurn + 1;
      
      // make the fizz, buzz variables
      int fizz = numberTurn % 3;
      int buzz = numberTurn % 5;

      // find out if it's a fizz, buzz, fizzbuzz or nothing
      if (fizz == 0 && buzz == 0) {
        // fizzbuzz number
        System.out.println("FizzBuzz");

      } else if (fizz == 0) {
        // fizz number
        System.out.println("Fizz");

      } else if (buzz == 0) {
        // buzz number
        System.out.println("Buzz");

      } else {
        // isn't anything
        System.out.println(numberTurn);
      }
    }
    
  }
}
