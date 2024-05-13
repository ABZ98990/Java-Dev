public class Main
{
    public static void main(String[] args)
    {
        String role = "admin";

        /* inefficient way of implying multi-conditions in a code
        if (role == "admin")
        {
            System.out.println("You are an admin");
        }
        else if (role == "moderator")
        {
            System.out.println("You are a moderator");
        }
        else
        {
            System.out.println("You are a guest");
        }
        */

        //using switch statement
        switch (role)
        {
            case "admin" -> System.out.println("You are an admin");
            case "moderator" -> System.out.println("You are a moderator");
            default -> System.out.println("You are a guest");
            //no need to use break statement with default clause
        }
    }
}