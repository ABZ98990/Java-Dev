public class Main
{
    public static void main(String[] args)
    {
        String[] fruits = {"Apple", "Mango", "Orange"};
        //Array traversing using For loop
        for(int i = 0; i < fruits.length; i++)
        {
            System.out.println(fruits[i]);
        }

        //Array traversing using For-each loop
        for(String i : fruits) //traverses by calling values instead of indexes
        {
            System.out.println(i);
        }
    }
}