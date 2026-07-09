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

public class findLengthOfLoopLL {
    static int loopLength(Node head){
        Node fast = head;
        Node slow = head;
        int cnt = 1;
        
        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                fast = fast.next;
                
                while(slow != fast){
                    fast = fast.next;
                    cnt++;
                }
                return cnt;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Creating a sample linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        // Creating a loop from fifth to second
        sixth.next = second;

        // Printing the result
        if (findLengthOfLoopLL.loopLength(head) > 0) {
            System.out.println("Length of the loop: " + findLengthOfLoopLL.loopLength(head));
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
