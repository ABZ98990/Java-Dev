import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        /*Linear Arrays
        int[] numbers = new int[5];
        numbers[0] = 15;
        numbers[1] = 25;
        System.out.println(Arrays.toString(numbers));
        */

        /*Linear Arrays: better
        int[] numbers = {1,9,7,5,6,3,1};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        */

        /*Multi-Dimensional Arrays
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        */

        //Multi-Dimensional Array: Better
        int [][] numbers = {{1,2,3} , {4,5}};
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(numbers.length);
    }
}