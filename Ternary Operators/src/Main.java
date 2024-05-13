public class Main
{
    public static void main(String[] args)
    {
        int income = 120_000;

        /* Wastage of lines
        String ClassName;
        if(income > 100_000)
        {
            ClassName = "First";
        }
        else
        {
            ClassName = "Economy";
        }
        System.out.println(ClassName);
        */

        //class allocation using Ternary Operator
        String ClassName = income > 100_000 ? "First" : "Economy";
        System.out.println(ClassName);
    }
}