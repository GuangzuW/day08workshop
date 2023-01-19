package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionSortExample {

    public void example1() {

        List <Integer> numbers=new ArrayList<Integer>();

        for (int i=0;i<10;i++){
            numbers.add((int)(Math.random()*100));
        }
        System.out.println("unsorted: "+numbers);
        Collections.sort(numbers);
        System.out.println("sorted: "+numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Resvese order sort: "+numbers);

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Resvese order sort: "+numbers);
        
    }
    public void example2 (){


        Employee emp1= new Employee("12345", "guangzu", "ss", "student", "wgz199154@hotmail.com", "3000");
        Employee emp2= new Employee("23456", "zacray", "ss", "student", "wgz199154@hotmail.com", "5000");
        Employee emp3= new Employee("34567", "alex", "ss", "student", "wgz199154@hotmail.com", "10000");
        Employee emp4= new Employee("45678", "hello", "ss", "student", "wgz199154@hotmail.com", "9000");
        Employee emp5= new Employee("56789", "hi", "ss", "student", "wgz199154@hotmail.com", "6000");

        List<Employee> employees=new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("emplyee before sorting: "+ employees);

        //ascending sort using collections
        Collections.sort(employees);
        System.out.println("emplyee after sorting: "+ employees);

        //sorting usinf Comparator and lambda
        employees.sort(Comparator.comparing(e->e.getSlaray()));
        System.out.println("emplyee after sorting(salary): "+ employees);


        List<Employee> filterEmployees=employees.stream().filter(e->e.getFullName().equalsIgnoreCase("guangzu")).collect(Collectors.toList());

        

    }




}
