class Node{
int data;
Node next;

Node(int data1, Node next1){
    this.data = data1;
    this.next = next1;
}

Node(int data1){
    this.data = data1;
    this.next = null;
}
}
public class detectLoopLL {
    static boolean loop(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new  Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third; 

        if (detectLoopLL.loop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }

}
