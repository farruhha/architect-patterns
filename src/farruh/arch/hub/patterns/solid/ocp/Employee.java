package farruh.arch.hub.patterns.solid.ocp;

public class Employee {

    private String employeeId;
    private String employeeName;
    private double bonus = 500;

    private String employeeType;

    public double computeSalary(double salary) {
        if (employeeType.equals("contract")) {
            return salary + 100;
        } else {
            return salary + bonus;
        }
    }
}
