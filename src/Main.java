import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AssignmentManager assignmentManager = new AssignmentManager();
        ModuleManager moduleManager = new ModuleManager();
        StudyTracker studyTracker = new StudyTracker();

        int choice = 0;

        while (choice != 8) {

            System.out.println("\n===== Academic Companion =====");
            System.out.println("1. Add Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. Add Module");
            System.out.println("4. View Modules");
            System.out.println("5. Add Study Session");
            System.out.println("6. View Study Sessions");
            System.out.println("7. Calculate Grade");
            System.out.println("8. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Module: ");
                    String module = scanner.nextLine();

                    System.out.print("Due Date: ");
                    String dueDate = scanner.nextLine();

                    System.out.print("Weighting (%): ");
                    int weighting = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Status: ");
                    String status = scanner.nextLine();

                    Assignment assignment =
                            new Assignment(title, module, dueDate, weighting, status);

                    assignmentManager.addAssignment(assignment);

                    System.out.println("Assignment Added!");
                    break;

                case 2:

                    assignmentManager.viewAssignments();
                    break;

                case 3:

                    System.out.print("Module Name: ");
                    String moduleName = scanner.nextLine();

                    System.out.print("Current Grade: ");
                    double currentGrade = scanner.nextDouble();
                    scanner.nextLine();

                    Module newModule =
                            new Module(moduleName, currentGrade);

                    moduleManager.addModule(newModule);

                    System.out.println("Module Added!");
                    break;

                case 4:

                    moduleManager.viewModules();
                    break;

                case 5:

                    System.out.print("Subject: ");
                    String subject = scanner.nextLine();

                    System.out.print("Hours Studied: ");
                    int hours = scanner.nextInt();
                    scanner.nextLine();

                    StudySession studySession =
                            new StudySession(subject, hours);

                    studyTracker.addSession(studySession);

                    System.out.println("Study Session Added!");
                    break;

                case 6:

                    studyTracker.viewSessions();
                    break;

                case 7:

                    System.out.print("Grade 1: ");
                    double grade1 = scanner.nextDouble();

                    System.out.print("Weight 1 (%): ");
                    double weight1 = scanner.nextDouble();

                    System.out.print("Grade 2: ");
                    double grade2 = scanner.nextDouble();

                    System.out.print("Weight 2 (%): ");
                    double weight2 = scanner.nextDouble();

                    double finalGrade =
                            GradeCalculator.calculateFinalGrade(
                                    grade1,
                                    weight1,
                                    grade2,
                                    weight2);

                    System.out.println("Final Grade: " + finalGrade);
                    break;

                case 8:

                    System.out.println("Goodbye!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }

        scanner.close();
    }
}