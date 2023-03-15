package employees;

import java.util.*;

public class EmployeeData {



    public static void main(String[] args) {
        List<Employee> data = new ArrayList<>(
                Arrays.asList(
                        new Employee("purna",24,"Jr.Developer",60000L,2,"Kansas"),
                        new Employee("Krishna",30,"Sr.Developer",100000L,5,"dallas"),
                        new Employee("vamsi",38,"lead",150000L,1,"dallas"),
                        new Employee("sai",40,"Manager",200000L,16,"Florida")

                )
        );

        System.out.println(data);
        System.out.println("vamsi");

        Set<Employee> set = new HashSet<>();
        int i=0;
        for (Employee emp: data) {
            set.add(emp);

        }
        System.out.println(set);




/*        Map<Integer,Employee> map = new TreeMap<>();

        *//*for(int i=0;i<data.size();i++){
            map.put(i,data.get(i));
        }*//*

        //Using forEach loop
        int i=0;
        for(Employee emp : data){
            map.put(i,emp);
            i=i+1;
        }
        System.out.println(map);*/



/*       for(Employee emp : data){
            if(emp.getLocation().equalsIgnoreCase("DalLaS"))
                System.out.println(emp);
        }*/

      //  data.stream()
              //  .filter(myEmployee -> myEmployee.getExperience() >10 && myEmployee.getSalary()>100000L && myEmployee.getLocation() == "dallas")
                //.forEach(System.out :: println);
    }
}
