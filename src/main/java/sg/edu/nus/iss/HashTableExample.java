package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public void example() {

        Map<String, Integer> phones=new Hashtable<>();

        phones.put("iPhone",10);
        phones.put("HuaWei", 2);
        phones.put("Oppo", 4);
        phones.put("Sammsung", 20);

        System.out.println("total phone types: " + phones.size());

        //phone.keyset()---get key set; phone.get(key)--get value of coresponding key
        for (String key : phones.keySet()){
            System.out.println(key +"--"+phones.get(key));
        }

        String searchString="";

        Console cons= System.console();

        while(!searchString.equals("quit")){
            searchString=cons.readLine("Enter searching string: ");
            if (phones.containsKey(searchString)){
                System.out.println(searchString + " - "+phones.get(searchString));
            }else {
                System.out.println("item not found");
            }
        }

        //remove all the map data
        phones.clear();

        //check the size of map after clear
        System.out.println("total phone types: " + phones.size());
    }
    
}
