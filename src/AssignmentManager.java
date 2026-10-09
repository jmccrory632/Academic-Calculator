import java.util.ArrayList;

public class AssignmentManager {

    private ArrayList<Assignment> assignments;

    public AssignmentManager() {
        assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void viewAssignments() {

        if (assignments.isEmpty()) {
            System.out.println("No assignments found.");
            return;
        }

        for (Assignment assignment : assignments) {

            System.out.println("----------------");
            System.out.println("Title: " + assignment.getTitle());
            System.out.println("Module: " + assignment.getModule());
            System.out.println("Due Date: " + assignment.getDueDate());
            System.out.println("Weighting: " + assignment.getWeighting() + "%");
            System.out.println("Status: " + assignment.getStatus());
        }
    }
}