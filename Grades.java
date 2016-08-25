/**
 * 
 */

/**
 * @author ËÎÓëçñ
 *
 */
public class Grades {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        student1.inputGrades();
        System.out.println(student1.getName() + "\'s average score is: " + student1.getAverage());

        System.out.println();
        System.out.println("----------------------");
        // create student2, "Mike"
        // input grades for Mary
        // print average for Mary
        student2.inputGrades();
        System.out.println(student2.getName() + "\'s average score is: " + student2.getAverage());
        // input grades for Mike
        // print average for Mike
        System.out.println();
        System.out.println("-----------------------");
        System.out.println(student1);
        System.out.println(student2);
    }

}
