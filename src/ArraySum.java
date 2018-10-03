import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
    public static final int SIZE = 10;

    public static void main(String[] args){
        ArrayList<Integer> givenArray = new ArrayList<Integer>(SIZE);
        int sum, size, a;
        boolean bool;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        size = sc.nextInt();
        for(a = 0; a < size; a++)
        {
            System.out.print("Enter an integer: ");
            givenArray.add(sc.nextInt());
        }
        System.out.print("Enter the sum: ");
        sum = sc.nextInt();
        checkArraySum c = new checkArraySum(givenArray, sum);
        bool = c.sumInArray();
        System.out.print(bool);
    }

}
