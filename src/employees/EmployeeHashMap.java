package employees;
import java.util.*;

public class EmployeeHashMap {

    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();

        Employee emp1 = new Employee("purna", 24, "Jr.Developer", 60000L, 2, "Kansas");
        Employee emp2 = new Employee("Krishna", 30, "Sr.Developer", 100000L, 5, "dallas");

        map.put(11, emp1);
        map.put(5, emp2);
        map.put(4, null);
        map.put(9, null);
        map.put(10, new Employee("jyothi", 30, "Sr.Developer", 100000L, 5, "dallas"));
        System.out.println(map);
        System.out.println(map.values());
        //map.hashCode();
      //System.out.println();

        /*for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            if (entry.getValue() != null && ("kansas").equalsIgnoreCase(entry.getValue().getLocation())) {
                System.out.println(entry.getValue().getName());
   }*/

        List<Employee> employeeList = new ArrayList<>(map.values());
        System.out.println(employeeList);

       // Set<Employee> employeeSet = new HashSet<>(map.values());
        //System.out.println(employeeList);



       /* Set<Map.Entry<Integer, Employee>> entrySet = map.entrySet();
        //System.out.println(entrySet);

        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<>(entrySet);
        //System.out.println(entryList);

        for (Map.Entry<Integer, Employee> e: entryList) {

            System.out.println(e);
            
        }*/


    }
}

