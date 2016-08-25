
import java.util.Scanner;

public class Student {
    private Scanner scan;
    private String name;
    private double scoreTest1;
    private double scoreTest2;
    private double average;
    // declare instance data
    // ---------------------------------------------
    // constructor
    // ---------------------------------------------

    public Student(String studentName) {
        scan = new Scanner(System.in);
        // add body of constructor
        name = studentName;
    }

    // ---------------------------------------------
    // inputGrades: prompt for and read in student's grades for test1 and test2.
    // Use name in prompts, e.g., "Enter's Joe's score for test1".
    // ---------------------------------------------
    public void inputGrades() {
        // add body of inputGrades
        System.out.println("Please enter student's score for test1 and score for test 2: ");
        scoreTest1 = scan.nextDouble();
        scoreTest2 = scan.nextDouble();
        System.out.println("score for test1 is: " + scoreTest1);
        System.out.println("score for test2 is: " + scoreTest2);
    }
    // ---------------------------------------------
    // getAverage: compute and return the student's test average
    // ------------------------ ---------------------
    // add header for getAverage

    public double getAverage() {

        average = (scoreTest1 + scoreTest2) / 2.0;
        return average;

        // add body of getAverage
    }

    // ---------------------------------------------
    // getName: print the student's name
    public String getName() {

        return name;
    }

    public String toString() {
        return (name + "\t" + "test1" + scoreTest1 + "\t" + "test2" + scoreTest2 + "\t" + "average" + average);
    }
}
// ---------------------------------------------
// add header for printName

// add body of printName
