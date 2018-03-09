package farruh.arch.hub.patterns.solid.ocp;

public class PermanantEmployee extends EmployeeAbstract {
    @Override
    public double computeSalary(double salary) {
        return salary + 100;
    }
}
