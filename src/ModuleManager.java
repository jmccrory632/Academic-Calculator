import java.util.ArrayList;

public class ModuleManager {

    private ArrayList<Module> modules;

    public ModuleManager() {
        modules = new ArrayList<>();
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void viewModules() {

        if (modules.isEmpty()) {
            System.out.println("No modules found.");
            return;
        }

        for (Module module : modules) {

            System.out.println("----------------");
            System.out.println("Module: " + module.getModuleName());
            System.out.println("Current Grade: " + module.getCurrentGrade());
        }
    }
}