public class Assignment {

    private String title;
    private String module;
    private String dueDate;
    private int weighting;
    private String status;

    public Assignment(String title, String module,
                      String dueDate, int weighting,
                      String status) {

        this.title = title;
        this.module = module;
        this.dueDate = dueDate;
        this.weighting = weighting;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getModule() {
        return module;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getWeighting() {
        return weighting;
    }

    public String getStatus() {
        return status;
    }
}