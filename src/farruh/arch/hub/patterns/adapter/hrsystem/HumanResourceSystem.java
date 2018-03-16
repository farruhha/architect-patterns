package farruh.arch.hub.patterns.adapter.hrsystem;

public class HumanResourceSystem {

    public Employee[] getEmployees() {
        Employee[] employees = new Employee[]{
                new Employee(11, "Dave", "Team Leader"),
                new Employee(13, "Mark", "Tester"),
                new Employee(14, "Cuba", "Developer")
        };
        return employees;
    }
}
