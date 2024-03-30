public class Main
{
    public static void main(String[] args)
    {
        /*division
        double result = (double) 10 /(double) 3;
        System.out.println(result);
        */

        /*increment operator
        int x = 1;
        //++x;
        x++;
        System.out.println(x);
        */

        //++x vs x++
        int x = 1;
        System.out.println("x is " + x + "\n");
        int y = x++;                                //value of x {1} first gets assigned to y then gets incremented by 1
        System.out.println("x : " + x);
        System.out.println("y : " + y + "\n");
        int z = ++x;                                //here, the value of x {2} first gets incremented by 1 and then gets assigned to z
        System.out.println("z : " + z);
    }
}