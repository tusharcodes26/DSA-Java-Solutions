import java.util.Arrays;
import java.util.List;

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

public class removeNthNodeFromEnd {
    // public Node remove(Node head, int N){

    //     if(head == null){
    //         return null;
    //     }

    //     Node temp = head;
    //     int cnt = 0;

    //     while(temp != null){
    //         cnt++;
    //         temp = temp.next;
    //     }

    //     if(cnt == N){
    //         return head.next;
    //     }

    //     int res = cnt - N;
    //     temp = head;

    //     while(temp != null){
    //         res--;
    //         if(res == 0){
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     temp.next = temp.next.next;

    //     return head;
    // }

    public Node remove(Node head, int N){

        Node dummy = new Node(0, head);

        Node fast = dummy;
        Node slow = dummy;

        for(int i = 0; i <= N; i++){
            fast= fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

     public void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int N = 1;

        // Create linked list manually
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        // Create Solution object
        removeNthNodeFromEnd sol = new removeNthNodeFromEnd();

        // Delete the Nth node from the end
        head = sol.remove(head, N);

        // Print the modified linked list
        sol.printLL(head);
    }
}
