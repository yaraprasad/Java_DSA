package com.java.stack.impl;;

public class StackJava {
  //Stack follow LIFO (Last in First out)
    // stack implementation using Arrays which is static in nature
    //that means once a capacity of the array is defined it is going to stay as is
    //throughout the life of the program
    //but in stack after a pop or push operation the current size will have to change
    //thus we need a variable that keeps track of this change so i am going to
    //declare a variable 'top' to cater to this need

    private int top;
    private final int size_of_stack; // remember the capacity of the array
    private final int[] stack;

    public StackJava(int size){
        stack=new int[size];
        this.top=-1; // represents the last index of the stack it can't be zero because that will imply
        //that there is one element in the stack which is not the case because the
        //stack is empty. hence it has to be -1.
        this.size_of_stack=size;
    }

    public int size(){
        return  top+1;
    }
    public boolean checkIfFull(){
        return size() == size_of_stack;
    }
    public boolean checkIfEmpty(){
        return size() == 0;
    }

    public void printStack(){
            if(!checkIfEmpty()){
                System.out.println("The stack is ");
                for (int i = top; i >=0 ; i--) {
                    System.out.println(stack[i]);
                }
            }
    }

    public void push(int x){
        if(checkIfFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }else{
            System.out.println("Pushed "+x);
            stack[++top]=x;
        }
    }

    public void pop(){
        if(checkIfEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }else {
            System.out.println("Pop "+peek());
            top=top-1;
        }
    }

    public int peek(){
            if(!checkIfEmpty()){
                return stack[top];
            }else {
                System.out.println("Stack is empty");
                return 0;
            }
    }


}
