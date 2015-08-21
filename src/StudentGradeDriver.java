import java.util.Scanner;

/**
 * Created by daniel on 8/21/2015.
 */
public class StudentGradeDriver
{
    private static Scanner s = new Scanner(System.in);
    private static StudentGradeList myList = new StudentGradeList();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice;

        printInstructions();

        while (!quit)
        {
            System.out.println("\nChoose your option:");
            choice = s.nextInt();
            s.nextLine(); // clears the input stream

            switch (choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printStudentGradeList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    printAverageGrade();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print your list.");
        System.out.println("\t 2 - To add an item to your list.");
        System.out.println("\t 3 - To modify an item in your list.");
        System.out.println("\t 4 - To remove an item in your list.");
        System.out.println("\t 5 - To calculate the average grade.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem()
    {
        System.out.print("Enter student grade: ");
        myList.addStudentGrade(s.nextDouble());
        s.nextLine(); // clears the input stream
    }

    public static void modifyItem()
    {
        System.out.print("Enter item no.: ");
        int position = s.nextInt();
        System.out.print("Enter new student grade: ");
        double newGrade = s.nextDouble();
        s.nextLine(); // clears the input stream
        myList.modifyStudentGrade(position - 1, newGrade);
    }

    public static void removeItem()
    {
        System.out.print("Enter item no.: ");
        int position = s.nextInt();
        s.nextLine(); // clears the input stream
        myList.removeStudentGrade(position - 1);
    }

    public static void printAverageGrade()
    {
        System.out.println("Student's average grade: " + myList.computeAverage());
    }
}
