import java.util.ArrayList;

/**
 * Created by daniel on 8/21/2015.
 */
public class StudentGradeList
{
    private ArrayList<Double> studentGradeList;

    public StudentGradeList()
    {
        studentGradeList = new ArrayList<Double>();
    }

    public void printStudentGradeList()
    {
        System.out.println("Student Grade list:");
        for (int i = 0; i < studentGradeList.size(); i++)
            System.out.println((i + 1) + ". " + studentGradeList.get(i));
    }

    public void addStudentGrade(Double studentGrade)
    {
        studentGradeList.add(studentGrade);
        System.out.println("Student grade has been added to the list.");
    }

    public void modifyStudentGrade(int position, Double newGrade)
    {
        studentGradeList.set(position, newGrade);
        System.out.println("Student grade [" + (position + 1) + "] has been updated to " + newGrade);
    }

    public void removeStudentGrade(int position)
    {
        studentGradeList.remove(position);
        System.out.println("Student grade [" + (position + 1) + "] has been removed.");
    }

    public double computeAverage()
    {
        double sum = 0.0;
        double gradeCount = studentGradeList.size();

        for (int i = 0; i < studentGradeList.size(); i++)
            sum += studentGradeList.get(i);

        return sum / gradeCount;
    }
}
