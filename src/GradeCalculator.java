public class GradeCalculator {

    public static double calculateFinalGrade(
            double grade1,
            double weight1,
            double grade2,
            double weight2) {

        return (grade1 * (weight1 / 100))
                + (grade2 * (weight2 / 100));
    }

    public static String predictDegree(double average) {

        if (average >= 70) {
            return "First Class";
        } else if (average >= 60) {
            return "Upper Second (2:1)";
        } else if (average >= 50) {
            return "Lower Second (2:2)";
        } else if (average >= 40) {
            return "Third Class";
        } else {
            return "Fail";
        }
    }
}