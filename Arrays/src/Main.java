import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        /*Linear Arrays
        String[] name = new String[2];
        name[0] = "ADIL";
        name[1] = "MEHMOOD";
        System.out.println(Arrays.toString(name));
        */

        /*Linear Arrays: better
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        */

        /*Multi-Dimensional Arrays
        int[][] numbers = new int[2][2];
        numbers[1][0] = 99;
        System.out.println(Arrays.deepToString(numbers));
        */

        //Multi-Dimensional Array: Better
        int [][] numbers = {{1,2,3} , {4,5,6}};
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers.length);
    }
}