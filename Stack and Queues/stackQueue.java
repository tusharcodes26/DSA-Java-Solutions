
import java.util.Stack;

public class stackQueue {
    private Stack<Integer> input, output;

    public stackQueue(){
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x){
        input.push(x);
    }

    public int pop(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        if(output.isEmpty()){
            System.out.println("Queue is Empty, Cannot Pop");
            return -1;
        }
        return output.pop();
    }

    public int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }

        if(output.isEmpty()){
            System.out.println("Queue is empty, cannot peek.");
            return -1;
        }

        return output.peek();
    }

    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

     public static void main(String[] args) {
        stackQueue q = new stackQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop());
        q.push(5);
        System.out.println("The front of the queue is " + q.peek());
        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
        System.out.println("The element popped is " + q.pop());
        System.out.println("The element popped is " + q.pop());
        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
    }

}
