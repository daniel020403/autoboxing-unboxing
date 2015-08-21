import java.util.Scanner;

/**
 * Created by daniel on 8/21/2015.
 */
public class AutoboxingUnboxingDemo
{
    private static Scanner s = new Scanner(System.in);
    private static Integer[] arrInteger = new Integer[10];

    public static void main(String[] args)
    {
        System.out.println("Enter 10 integers:");
        getInput();
        System.out.println("Integer array contents:");
        printIntegerArray();
    }

    private static void getInput()
    {
        for (int i = 0; i < arrInteger.length; i++)
            arrInteger[i] = s.nextInt();
        s.nextLine(); // clears the input stream
    }

    private static void printIntegerArray()
    {
        for (int i = 0; i < arrInteger.length; i++)
            System.out.println(arrInteger[i] + 1);
    }
}
