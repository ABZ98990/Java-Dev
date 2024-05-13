import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number: ");
            int number = sc.nextInt();
            if (((number%5 == 0)  && (number % 3 == 0)))
            {
                System.out.println("FizzBuzz");
            }
            else if (number%3 == 0)
            {
                System.out.println("Buzz");
            }
            else if (number % 5 == 0)
            {
                System.out.println("Fizz");
            } else
            {
                System.out.println(number);
            }
            System.out.print("Do you wish to try again? [y/n]: ");
            String con = sc.next();
            if (con.equals("n")) //instead of Objects.equals(con, "n") we could directly call .equal method for "con" object
            {
                break;
            }
        }
    }
}