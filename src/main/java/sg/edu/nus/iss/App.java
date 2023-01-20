package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws IOException {

        // ArraySortExample a= new ArraySortExample();
        // a.example1();
        // a.example2();

        // HashMapExample hm=new HashMapExample();
        // hm.example();

        // HashTableExample ht =new HashTableExample();
        // ht.example();

        // ConcurrentHashMapExample chm=new ConcurrentHashMapExample();
        // chm.example();

        // CollectionSortExample cs=new CollectionSortExample();
        // cs.example1();
        // cs.example2();


        // LinkListExample ll=new LinkListExample();
        // ll.example();

        // StackExample se=new StackExample();
        // se.example();

        String fileEmployee="employee.txt";
        String dirPath="data";
        File newEmployeeFile=new File(dirPath+File.separator+fileEmployee);
        boolean isEmployeeFileCreated= newEmployeeFile.createNewFile();

        if (isEmployeeFileCreated)
            System.out.println("new file "+fileEmployee+" created");
        else
            System.out.println("file "+fileEmployee+" already exists");

        

        CSVWriter cw=new CSVWriter();
        List<Employee> employeeList=cw.GenerateEmployee();
        cw.writeToCSV(employeeList, dirPath+File.separator+fileEmployee);



        List<Employee> employeeList2=cw.ReadFromCSV();

        for (Employee e:employeeList2){
            System.out.println(e);
        }

    }
}
