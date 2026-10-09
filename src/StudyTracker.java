import java.util.ArrayList;

public class StudyTracker {

    private ArrayList<StudySession> sessions;

    public StudyTracker() {
        sessions = new ArrayList<>();
    }

    public void addSession(StudySession session) {
        sessions.add(session);
    }

    public int getTotalHours() {

        int total = 0;

        for (StudySession session : sessions) {
            total += session.getHours();
        }

        return total;
    }

    public void viewSessions() {

        for (StudySession session : sessions) {
            session.displaySession();
        }

        System.out.println("Total Hours Studied: " + getTotalHours());
    }
}