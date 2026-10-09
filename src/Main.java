import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AssignmentManager assignmentManager = new AssignmentManager();
        assignmentManager.loadAssignments();

        ModuleManager moduleManager = new ModuleManager();
        StudyTracker studyTracker = new StudyTracker();

        int choice = 0;

        while (choice != 11) {

            System.out.println("\n===== DASHBOARD =====");
            System.out.println("Assignments: " + assignmentManager.getAssignmentCount());
            System.out.println("Modules: " + moduleManager.getModuleCount());
            System.out.println("Study Hours: " + studyTracker.getTotalHours());
            System.out.println("=====================");

            System.out.println("\n===== Academic Companion =====");
            System.out.println("1. Add Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. Delete Assignment");
            System.out.println("4. Mark Assignment Complete");
            System.out.println("5. Add Module");
            System.out.println("6. View Modules");
            System.out.println("7. Add Study Session");
            System.out.println("8. View Study Sessions");
            System.out.println("9. Calculate Grade");
            System.out.println("10. Predict Degree Classification");
            System.out.println("11. Exit");
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
                            new Assignment(title, module,
                                    dueDate, weighting, status);

                    assignmentManager.addAssignment(assignment);
                    assignmentManager.saveAssignments();

                    System.out.println("Assignment Added!");
                    break;

                case 2:

                    assignmentManager.viewAssignments();
                    break;

                case 3:

                    assignmentManager.viewAssignments();

                    System.out.print("Enter assignment number to delete: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine();

                    assignmentManager.deleteAssignment(deleteIndex - 1);
                    assignmentManager.saveAssignments();
                    break;

                case 4:

                    assignmentManager.viewAssignments();

                    System.out.print("Enter assignment number to complete: ");
                    int completeIndex = scanner.nextInt();
                    scanner.nextLine();

                    assignmentManager.markAssignmentComplete(completeIndex - 1);
                    assignmentManager.saveAssignments();
                    break;

                case 5:

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

                case 6:

                    moduleManager.viewModules();
                    break;

                case 7:

                    System.out.print("Subject: ");
                    String subject = scanner.nextLine();

                    System.out.print("Hours Studied: ");
                    int hours = scanner.nextInt();
                    scanner.nextLine();

                    StudySession session =
                            new StudySession(subject, hours);

                    studyTracker.addSession(session);

                    System.out.println("Study Session Added!");
                    break;

                case 8:

                    studyTracker.viewSessions();
                    break;

                case 9:

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

                    System.out.println("Final Grade: "
                            + finalGrade + "%");

                    break;

                case 10:

                    System.out.print("Enter Average Grade: ");
                    double average = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Predicted Degree: "
                            + GradeCalculator.predictDegree(average));

                    break;

                case 11:

                    System.out.println("Goodbye!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }

        scanner.close();
    }
}