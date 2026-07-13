
import java.util.Stack;

public class reverseStack {
    public static void insert(Stack<Integer> stack, int val){
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }

        int topVal = stack.pop();
        insert(stack, val);

        stack.push(topVal);
    }

    public static   void reverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;

        int topVal = stack.pop();

        reverse(stack);

        insert(stack, topVal);
    }
    public static void main(String[] args) {
 
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverseStack.reverse(st);

        System.out.print("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
}
