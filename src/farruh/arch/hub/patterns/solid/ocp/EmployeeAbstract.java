package farruh.arch.hub.patterns.solid.ocp;

public abstract class EmployeeAbstract {
    private String employeeId;
    private String employeeName;

    public abstract double computeSalary(double salary);
}
