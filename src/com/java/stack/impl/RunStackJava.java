package com.java.stack.impl;

public class RunStackJava {
    public static void main(String[] args) {


        StackJava stack = new StackJava(3);

        //Approach 1
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        //stack.push(4);
        //commented above before making a call to pop, commented above line because it will exit the program flow.

        //Approach 2
        stack.pop();
        System.out.println("Top most element at present "+stack.peek());
        System.out.println("Size of the stack "+stack.size());
        //stack.printStack();


        stack.pop();
        stack.pop();
        //stack.pop();  //gives Stack is empty
        System.out.println("Top most element at present "+stack.peek());
        System.out.println("Size of the stack "+stack.size());
        //stack.printStack();


    }
}
