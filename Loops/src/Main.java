public class Main
{
    public static void main(String[] args)
    {
        //FOR loop
        for (int i = 0; i < 5; i++)
        {
            System.out.println("mellow!");
        }

        //WHILE loop
        int i = 0;
        while (i < 5)
        {
            System.out.println("greetings!");
            i++;
        }

        //DO-WHILE loop, runs at least once
        int j = 0;
        do
        {
            System.out.println("Do you wanna know a secret?");
            j++;
        }
        while (j < 2);
    }
}