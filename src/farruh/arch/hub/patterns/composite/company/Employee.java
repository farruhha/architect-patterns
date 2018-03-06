package farruh.arch.hub.patterns.composite.company;

import java.util.ArrayList;
import java.util.List;

public class Employee implements IEmployee {

    private String name;
    private int monthlySalary;
    private String designation;

    private ArrayList<IEmployee> subordinateList = new ArrayList<>();


    public Employee(String name, int monthlySalary, String designation){
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.designation = designation;
    }

    @Override
    public int getYearlySalary() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public ArrayList<IEmployee> getSubordinateList() {
        return subordinateList;
    }

    public void setSubordinateList(ArrayList<IEmployee> subordinateList) {
        this.subordinateList = subordinateList;
    }

    public void addSubordinate(IEmployee employee){
        subordinateList.add(employee);
    }

    public void removeSubordinate(IEmployee employee){
        subordinateList.remove(employee);
    }

    public List<IEmployee> getChildren(){
        return getSubordinateList();
    }
}
