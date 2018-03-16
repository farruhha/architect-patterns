package farruh.arch.hub.patterns.adapter.hrsystem;

public class Employee {

    private int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
