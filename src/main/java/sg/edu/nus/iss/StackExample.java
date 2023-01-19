package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {


    public void example(){

        Stack<Integer> stack =new Stack<Integer>();

        //pushing or puttinh someyhing iin the stack
        for (int i=0;i<10;i++){
            stack.push(i);
        }

        //pop or taking somrting from the stack
        for (int i=0;i<5;i++){
            Integer stackItem=stack.pop();
            System.out.println("stack item (pop): "+stackItem);
        }


        //see what is the last on the top of the stack
        Integer lastItem=stack.peek();
        System.out.println("the first element on top of stack: "+lastItem);

        // dee what is the first items in the stack
        Integer firstElement=stack.firstElement();
        System.out.println("the first element in bottom of stack: "+firstElement);


        //search for the item in the stack and return the index where its found on the stack
        Integer indexOfElement=stack.search(2);
        System.out.println("the index of an element(2): "+indexOfElement);


        //iterate through a stack
        Iterator<Integer> its=stack.iterator();
        while(its.hasNext()){
            Integer stackItem=its.next();
            System.out.println("Iterators stack item: "+stackItem);
        }
    }
}
