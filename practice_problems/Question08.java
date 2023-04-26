package practice_problems;

public class Question08 {
    /**
     * Converts a grade to a letter grade, using the 10-point scale.
     * 90-100 -> A
     * 80-89 -> B
     * 70-79 -> C
     * 60-69 -> D
     * 0-59 -> F
     * @param grade the grade to convert
     * @return the letter grade
     */
    public static String convertToLetterGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println("convertToLetterGrade(100) -> " + convertToLetterGrade(100)); // A
        System.out.println("convertToLetterGrade(90) -> " + convertToLetterGrade(90)); // A
        System.out.println("convertToLetterGrade(89) -> " + convertToLetterGrade(89)); // B
        System.out.println("convertToLetterGrade(80) -> " + convertToLetterGrade(80)); // B
        System.out.println("convertToLetterGrade(79) -> " + convertToLetterGrade(79)); // C
        System.out.println("convertToLetterGrade(70) -> " + convertToLetterGrade(70)); // C
        System.out.println("convertToLetterGrade(69) -> " + convertToLetterGrade(69)); // D
        System.out.println("convertToLetterGrade(60) -> " + convertToLetterGrade(60)); // D
        System.out.println("convertToLetterGrade(59) -> " + convertToLetterGrade(59)); // F
        System.out.println("convertToLetterGrade(0) -> " + convertToLetterGrade(0)); // F
    }
}