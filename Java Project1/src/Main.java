import java.util.Scanner;

public static void main(String[] args) {
    String name;
    String grade;
    int[] grades = new int[4];

    Scanner user = new Scanner(System.in);
    System.out.println("Welcome to the Grade Calculator");

    System.out.println("Enter your name: ");
    name = user.nextLine();

    System.out.println("(Freshmen, Sophomore, Junior, Senior)\nEnter your grade level: ");
    grade = user.nextLine();

    Student student = new Student(name,grade);

    System.out.println(student.getName() + " " + student.getGrade());

    System.out.println("\nPlease enter your grades to the respective categories below: ");

    System.out.println("Assignments: ");
    int a = user.nextInt();
    grades[0] = a;

    System.out.println("Midterm: ");
    int b = user.nextInt();
    grades[1] = b;

    System.out.println("Projects: ");
    int c = user.nextInt();
    grades[2] = c;

    System.out.println("Final: ");
    int d = user.nextInt();
    grades[3] = d;


    FinalGradeCalc.formatGrades(grades);
    System.out.println("Overall Grade: " + FinalGradeCalc.FinalGrade(grades) + "\nfor student: " + student.getName() +" who is a "+ student.getGrade());
}



