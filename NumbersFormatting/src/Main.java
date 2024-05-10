import java.text.NumberFormat;

public class Main
{
    public static void main(String[] args)
    {
        //cannot make new instance with 'new' keyword because the class is Abstract
        //NumberFormat currency = new NumberFormat();

        //currency formatting with the use of a 'Factory Method'
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currency_result = currency.format(1234567.89);
        System.out.println(currency_result);

        //percentage formatting with the use of a 'Factory Method'
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percentage_result = percentage.format(0.45);
        System.out.println(percentage_result);
    }
}