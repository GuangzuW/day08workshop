package sg.edu.nus.iss;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        ArraySortExample a= new ArraySortExample();
        a.example1();
        a.example2();

        HashMapExample hm=new HashMapExample();
        hm.example();

        HashTableExample ht =new HashTableExample();
        ht.example();

        ConcurrentHashMapExample chm=new ConcurrentHashMapExample();
        chm.example();

        CollectionSortExample cs=new CollectionSortExample();
        cs.example1();
        cs.example2();

    }
}
