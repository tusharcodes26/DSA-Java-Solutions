
import java.util.Stack;

public class sortStack {
    public void insert(Stack<Integer> stack, int temp){
        if(stack.isEmpty() || stack.peek() <= temp){
            stack.push(temp);
            return;
        }
        
        int val = stack.pop();
        insert(stack, temp);

        stack.push(val);
    }
    public void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sort(stack);
            insert(stack,temp);
        }
    }
    public static void main(String[] args) {
        sortStack sol = new sortStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sol.sort(stack);

        System.out.print("Sorted stack (descending order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
