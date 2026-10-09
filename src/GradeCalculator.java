public class GradeCalculator {

    public static double calculateFinalGrade(
            double grade1,
            double weight1,
            double grade2,
            double weight2) {

        return (grade1 * (weight1 / 100))
                + (grade2 * (weight2 / 100));
    }
}