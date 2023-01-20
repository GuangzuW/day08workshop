package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IOstream {

    public static void main(String[] args) throws IOException {
        String dirPath="data";
        String fileName="data.txt";


        //
        File newDir=new File(dirPath);
        boolean isDirCreated= newDir.mkdir();

        if(isDirCreated)
            System.out.println("new directory "+ dirPath +"created");
        else 
            System.out.println("new directory "+ dirPath +"already exists");

        File newFile =new File(dirPath + File.separator+fileName);
        boolean isFileCreated =newFile.createNewFile();
        
        if(isFileCreated)
            System.out.println("new file "+ fileName +"created");
        else 
            System.out.println("file "+ fileName +"already exists");

        File fileList[]=newDir.listFiles();
        for (File f:fileList){
            System.out.println("File "+ f.getCanonicalPath() +":" +f.getCanonicalFile());
            System.out.println();
            System.out.println("File "+ f.getAbsolutePath() +":" +f.getAbsoluteFile());

        }

        //use fileoutstream to write some integers into file data.txt
        Console con =System.console();
        
        FileOutputStream fos=new FileOutputStream((dirPath + File.separator+fileName),true);
        for (int i=0;i<10;i++){
            char str[]=Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }

        String welcomeMessage= "Welcome to iss tfip program";

        //convert string to byte[] array using getByte[]
        byte[]outputData=welcomeMessage.getBytes();

        //wirting the string in byte array
        //one character at a time to the file 
        fos.write(outputData);

        fos.close();


        FileWriter fw=new FileWriter(newFile,true);
        for (int i=0;i<10;i++){
            fw.write(String.format("%d FileWriter", i));
            fw.write("\n");
        }
        fw.flush();
        fw.close();

    }
    
}
