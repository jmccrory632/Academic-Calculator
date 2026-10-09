public class StudySession {

    private String subject;
    private int hours;

    public StudySession(String subject, int hours) {
        this.subject = subject;
        this.hours = hours;
    }

    public String getSubject() {
        return subject;
    }

    public int getHours() {
        return hours;
    }

    public void displaySession() {
        System.out.println("Subject: " + subject);
        System.out.println("Hours Studied: " + hours);
    }
}