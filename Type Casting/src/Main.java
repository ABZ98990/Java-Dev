public class Main
{
    public static void main(String[] args)
    {
        //implicit casting (automatic)
        short x = 1;
        int y = x + 2;
        System.out.println("y : " + y);

        //explicit casting
        double a = 1.1;
        int b = (int) (a + 2);
        System.out.println("b : " + b);

        double f = 1.1;
        double g = (double) f + (double) 2;
        System.out.println("g : " + g);

        //string casting using wrapper class
        String str = "1";
        int r = Integer.parseInt(str) + 2;
        System.out.println("r : " + r);

        //string being casted into float using wrapper class
        String s = "1.1";
        float u = Float.parseFloat(s) + 2;
        System.out.println("u : " + u);
    }
}