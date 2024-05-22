package src.ashu.arrayOperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee("MH", "IT", 100000); //
        Employee e2 = new Employee("MH", "POLICE", 1000);
        Employee e3 = new Employee("MH", "IT", 9999); //
        Employee e4 = new Employee("UP", "IT", 100000);
        Employee e5 = new Employee("BIHAR", "POLICE", 100000);
        Employee e6 = new Employee("TN", "IT", 100000);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        emp.add(e6);

        Map<Empl, Integer> resultMap= new HashMap<>();

        for(int i=0; i<emp.size(); i++) {

            resultMap.put(new Empl(emp.get(i).getState(), emp.get(i).getDepartment()), emp.get(i).getSalary());

        }







        // state ,department, salary
        // MH, IT, 1,00,000
        // MH, Police, 1,00,00,000

        //Output : max salary/ dept/ state

//        List<Employee> result = new ArrayList<>();
//
//        for(int i=0; i<emp.size(); i++) {
//            String tempState = emp.get(i).getState();
//            String tempDept = emp.get(i).getDepartment();
//            int maxSalarySoFar = emp.get(i).getSalary();
//
//            for(int j =0; j< emp.size(); j++) {
//
//                if(emp.get(j).getDepartment() == tempDept && emp.get(j).getState() == tempState) {
//                    if(emp.get(j).getSalary() > maxSalarySoFar) {
//                        maxSalarySoFar = emp.get(j).getSalary();
//                    }
//                }
//            }
//            result.add(new Employee(tempState, tempDept, maxSalarySoFar));
//        }
//
//        System.out.println(result);




    }
}
