package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void example() {
        Map<String, Integer> laptops =new ConcurrentHashMap<>();

        laptops.put("Acer", 5);
        laptops.put("Apple", 10);
        laptops.put("MSI", 10);
        laptops.put("Asus", 15);

        //print total size of the map objects
        System.out.println("Total # of laptops:  "+laptops.size());

        //iterate through the map using keyset method
        for (String key:laptops.keySet()){
            System.out.println(key+ " -- " +laptops.get(key));
        }

        String searchString="Asus";
        if(laptops.containsKey(searchString)){
            System.out.println(searchString+ " -- " +laptops.get(searchString));
        }


        Enumeration <Integer> elems = ((ConcurrentHashMap<String,Integer>)laptops).elements();
        while(elems.hasMoreElements()){
            System.out.println("concurrenthashmap: "+ elems.nextElement());
        }

        laptops.putIfAbsent("Apple", 25);//if item exist, ingore, not overwrite
        laptops.putIfAbsent("Microsoft", 25);
        searchString="Apple";
        if(laptops.containsKey(searchString)){
            System.out.println(searchString+ " -- " +laptops.get(searchString));
        }
        laptops.put("Apple", 25);

        //key and value both cannot null
    }
    
}
