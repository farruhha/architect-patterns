package farruh.arch.hub.patterns.adapter.hrsystem;

import java.util.List;

public class ThirdPartyHRSystem {

    public void processSalary(List<Employee> arrayList){

        for (Employee employee : arrayList){
            if (employee.getDesignation().equals("Team Leader")){
                System.out.println("100$ assigned to team leader " + employee.getName());
            }else if (employee.getDesignation().equals("Developer")){
                System.out.println("90$ assigned to developer " + employee.getName());
            }else if (employee.getDesignation().equals("tester")){
                System.out.println("E20$ assigned to tester " + employee.getName());
            }
        }
    }
}
