import java.util.ArrayList;
import java.io.*;

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

        for (int i = 0; i < assignments.size(); i++) {

            Assignment assignment = assignments.get(i);

            System.out.println("----------------");
            System.out.println("Assignment #" + (i + 1));
            System.out.println("Title: " + assignment.getTitle());
            System.out.println("Module: " + assignment.getModule());
            System.out.println("Due Date: " + assignment.getDueDate());
            System.out.println("Weighting: " + assignment.getWeighting() + "%");
            System.out.println("Status: " + assignment.getStatus());
        }
    }

    public void deleteAssignment(int index) {

        if (index >= 0 && index < assignments.size()) {

            assignments.remove(index);

            System.out.println("Assignment deleted.");

        } else {

            System.out.println("Invalid assignment number.");
        }
    }

    public void markAssignmentComplete(int index) {

        if (index >= 0 && index < assignments.size()) {

            Assignment assignment = assignments.get(index);

            assignment.setStatus("Completed");

            System.out.println("Assignment marked as completed.");

        } else {

            System.out.println("Invalid assignment number.");
        }
    }

    public int getAssignmentCount() {
        return assignments.size();
    }

    public void saveAssignments() {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("assignments.txt"));

            for (Assignment assignment : assignments) {

                writer.write(
                        assignment.getTitle() + "," +
                                assignment.getModule() + "," +
                                assignment.getDueDate() + "," +
                                assignment.getWeighting() + "," +
                                assignment.getStatus()
                );

                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving assignments.");
        }
    }

    public void loadAssignments() {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("assignments.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Assignment assignment =
                        new Assignment(
                                data[0],
                                data[1],
                                data[2],
                                Integer.parseInt(data[3]),
                                data[4]
                        );

                assignments.add(assignment);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No saved assignments found.");
        }
    }
}