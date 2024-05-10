import java.text.NumberFormat;

public class Main
{
    public static void main(String[] args)
    {
        //cannot make new instance with 'new' keyword because the class is Abstract
        //NumberFormat currency = new NumberFormat();

        //using 'Factory Method'
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.89);
        System.out.println(result);
    }
}