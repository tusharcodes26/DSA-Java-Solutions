
import java.util.Stack;

public class implementMinStack {
    private Stack<Integer> st;
    private int mini;

    public implementMinStack(){
        st = new Stack<>();
    }

    public void push(int value){
        if(st.isEmpty()){
            mini = value;
            
            st.push(value);
            return;
        }

        if(value > mini){
            st.push(value);
        }
        else{
            st.push(2 * value - mini);
            mini = value;
        }
    }

    public void pop(){
        if(st.isEmpty()){
            return;
        }

        int x = st.pop();

        if(x < mini){
            mini = 2 * mini - x;
        }
    }

    public int top(){
        if(st.isEmpty()) return -1;

        int x = st.peek();

        if(mini < x) return x;

        return mini;
    }

    public int getMin(){
        return mini;
    }

    public static void main(String[] args) {
        implementMinStack s = new implementMinStack();

        // Function calls
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.print(s.getMin() + " ");
        s.pop();
        System.out.print(s.top() + " ");
        s.pop();
        System.out.print(s.getMin());
    }


}
