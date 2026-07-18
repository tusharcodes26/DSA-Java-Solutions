class Node {
    int val;
    Node next;
    Node(int d) {
        val = d;
        next = null;
    }
}

public class linkedListStack {
    private Node head;
    private int size;

    public linkedListStack(){
        head = null;
        size = 0;
    }

    public void push(int x){
        Node element = new Node(x);

        element.next = head;
        head = element;

        size++;
    }

    public int pop(){
        if(head == null){
            return -1;
        }

        int value = head.val;
        Node temp = head;
        head = head.next;
        temp = null;
        size--;

        return value;
    }

    public int top(){
        if(head == null){
            return -1;
        }

        return head.val;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

     public static void main(String[] args) {
        
        linkedListStack st = new linkedListStack();

        
        String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "top":
                    System.out.print(st.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((st.isEmpty() ? "true" : "false") + " ");
                    break;
                case "LinkedListStack":
                    System.out.print("null ");
                    break;
                default:
                    break;
            }
        }
    }
}
