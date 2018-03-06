package farruh.arch.hub.patterns.composite.company;

public class SoftwareEngineer implements IEmployee {

    private String name;
    private int salary;
    private String designation;

    public SoftwareEngineer(String name, int salary, String designation){
        this.name  =  name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public int getYearlySalary() {
        return 0;
    }
}
