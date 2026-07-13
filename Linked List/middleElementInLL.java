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
public class middleElementInLL {
//     static Node findMiddle(Node head){
//         Node temp = head;
//         int cnt = 0;
//         while(temp != null){
//             cnt++;
//             temp = temp.next;
//         }
//         int mid = cnt/2+1;
//         temp = head;

//         while(temp != null){
//             mid = mid-1;

//             if(mid == 0){
//                 break;
//             }
//             temp = temp.next;
//         }
//         return temp;
//     }
        static Node findMiddle(Node head){
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null && slow != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            return slow;
        }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode = findMiddle(head);

        System.out.println("The middle node value is: " + middleNode.data);
    }
}
