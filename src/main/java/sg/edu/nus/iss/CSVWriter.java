package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVWriter {

    public static final String COM_DELIMITER=",";
    public static final String NEWLINE_SEPERATOR="\n";


    private static final String FILE_HEADER= "staffNo,fullName,department,role,emailAddress,slaray";

    public List<Employee> employees = null; 

    public List<Employee> GenerateEmployee(){
        employees =new ArrayList<Employee>();

        Employee emp1= new Employee("12345", "guangzu", "ss", "student", "wgz199154@hotmail.com", "3000");
        Employee emp2= new Employee("23456", "zacray", "ss", "student", "wgz199154@hotmail.com", "5000");
        Employee emp3= new Employee("34567", "alex", "ss", "student", "wgz199154@hotmail.com", "10000");
        Employee emp4= new Employee("45678", "hello", "ss", "student", "wgz199154@hotmail.com", "9000");
        Employee emp5= new Employee("56789", "hi", "ss", "student", "wgz199154@hotmail.com", "6000");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        return employees;
    }


    public void writeToCSV(List<Employee> employees,String fileName)throws IOException{

        FileWriter fw= new FileWriter(fileName,true);

        //writer file_header to csv

        fw.append(FILE_HEADER).toString();
        fw.append(NEWLINE_SEPERATOR);

        //read the record row by row and wirte it using append
        for (Employee e:employees){
            fw.append(e.getStaffNo());
            fw.append(COM_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COM_DELIMITER);
            fw.append(e.getRole());
            fw.append(COM_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COM_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COM_DELIMITER);
            fw.append(e.getSlaray());
            fw.append(NEWLINE_SEPERATOR);
        }
        
        fw.flush();
        fw.close();


    }

    public List<Employee> ReadFromCSV() throws IOException{
        
        String srcPath = "data/employee.txt";
        String destPath= "data/employee2.txt";

        File employee2File=new File(destPath);
        boolean isFileCreated=employee2File.createNewFile();

        if(isFileCreated){
            System.out.println("new employee2.txt already created");
        }else {
            System.out.println("employee2.txt already exists");
        }

        List<Employee> employee=new ArrayList<Employee>();

        FileReader fr=new FileReader(srcPath);
        BufferedReader br= new BufferedReader(fr);

        BufferedWriter bw=new BufferedWriter(new FileWriter(employee2File));

        String Line;
        Line=br.readLine();

        while (Line!=null){
            bw.write(Line);
            bw.newLine();
            Line=br.readLine();
        }

        while((Line=br.readLine())!=null){
            String[] splited= Line.split(",");
            if (splited.length<6){
                System.out.println("invalid data");
                continue;
            }
            Employee temp= new Employee(splited[0],splited[1], splited[2], splited[3], splited[4], splited[5]);
            employee.add(temp);
        }
        br.close();
        bw.close();

        return employee;
    }


    
}
