import java.util.EmptyStackException;

public class Stack {
    private int[] arr;
    private int top;

    Stack (int size){
        arr = new int[size];
        top = -1;
    }
    boolean isFull(){
        return top == arr.length - 1;
    }
    boolean isEmpty(){
        return top == -1;

    }
    void push(int x){
        try{
            if(isFull()){
                throw new StackOverflowError();
            }
            arr[++top] = x;
            System.out.println("Pushed "+x);
        }
        catch (StackOverflowError e){
            System.out.println("Stack Overflow");
        }
    }
    void pop(){
        try{
            if(isEmpty()){
                throw new EmptyStackException();
            }

            System.out.println("Popped "+arr[top]);
            top--;

        }
        catch (EmptyStackException e){
            System.out.println("Stack Empty");
        }
    }
}

