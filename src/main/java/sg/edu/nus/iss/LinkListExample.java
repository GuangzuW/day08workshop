package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkListExample {


    public void example(){

        LinkedList<String> ll=new LinkedList<>();
        ll.add("aaa");
        ll.add("bbb");
        ll.add("ccc");
        ll.add("ddd");
        ll.add("eee");
        ll.add("fff");
        ll.add("ggg");

        ll.forEach (item->System.out.print(item));

        System.out.println();

        ll.remove("ccc");

        ll.forEach (item->System.out.print(item));
        System.out.println();

        ll.removeFirst();
        ll.removeLast();
        
        ll.forEach (item->System.out.print(item));
        System.out.println();


    }


    
}
