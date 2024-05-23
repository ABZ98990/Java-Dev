public class Main
{
    public static void main(String[] args)
    {
        int income = 120_000;
        /*
        Scope resolution error where the Boolean variable is limited to only the conditional statement

        if (income > 100_000)
        {
            boolean HasHighIncome = true;
        }
        System.out.println(HasHighIncome);
        */

        /*
        Conventional method where you initially declare and initialize the variable with an assumed value and then change it using a conditional statement

        boolean HasHighIncome = false;
        if (income > 100_000)
        {
            HasHighIncome = true;
        }
        System.out.println(HasHighIncome);
        */

        //Best practice of setting conditional variable values
        boolean HasHighIncome = (income > 100_000);
        System.out.println(HasHighIncome);
    }
}
