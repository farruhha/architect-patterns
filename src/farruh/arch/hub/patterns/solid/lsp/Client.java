package farruh.arch.hub.patterns.solid.lsp;

import farruh.arch.hub.patterns.solid.ocp.ContractEmployee;
import farruh.arch.hub.patterns.solid.ocp.Employee;
import farruh.arch.hub.patterns.solid.ocp.EmployeeAbstract;
import farruh.arch.hub.patterns.solid.ocp.PermanantEmployee;

public class Client {
    public static void main(String[] args) {
        EmployeeAbstract employee = new ContractEmployee();
        EmployeeAbstract employee2 = new PermanantEmployee();
    }
}
