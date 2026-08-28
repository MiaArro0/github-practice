public class FinalGradeCalc {

    //Averages out the categories to get the final grade
    public static int FinalGrade(int[] grades) {
        int finalScore = 0;

        for (int grade : grades) {
            finalScore += grade;
        }

        return finalScore/4;
    }

    //Formats the user input from main into text
    public static void formatGrades(int[] grades){
        String[] categories = {"Assignments","Midterm","Project","Final"};

        System.out.println("Your Grades:");
        for(int i=0 ; i < 4 ; i++)
            System.out.println(categories[i] + ": " + grades[i]);
        }

    }

