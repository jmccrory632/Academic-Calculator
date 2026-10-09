public class Module {

    private String moduleName;
    private double currentGrade;

    public Module(String moduleName, double currentGrade) {
        this.moduleName = moduleName;
        this.currentGrade = currentGrade;
    }

    public String getModuleName() {
        return moduleName;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }
}