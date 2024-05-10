import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Reading integer input using Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(sc.nextInt());

        //Reading floats/doubles/bytes
        System.out.print("Enter a float value: ");
        System.out.println((float)(sc.nextFloat()));

        System.out.print("Enter a double value: ");
        System.out.println(sc.nextDouble());

        System.out.print("Enter a byte value: ");
        System.out.println(sc.nextByte());
    }
}