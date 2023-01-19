package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public void example1 () {

        String name[]={"darryl","elaine","james","zoanne","chris","nark","sophia","ashar","brandon","helen","daniel","marcus"};

        System.out.println("unsorted array: "+Arrays.toString(name));

        Arrays.sort(name);

        System.out.println("Sorted: "+Arrays.toString(name));

        Arrays.sort(name,Collections.reverseOrder());

        System.out.println("Reverse order: "+Arrays.toString(name));

    }
    

    public void example2() {

        //Integer collection type;
        //int primitive type

        Integer numbers[]={10,5,7,9,2,3,8,9,8};
        //int[] numbers ={10,5,7,9,2,3,8,9,8};

        Arrays.sort(numbers);

        System.out.println("sorted number: " +Arrays.toString(numbers));

        Arrays.sort(numbers,Collections.reverseOrder());

        System.out.println("reverse sorted number: " +Arrays.toString(numbers));

    }

}
