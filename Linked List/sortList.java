

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

public class sortList {
    // public Node sort(Node head){

    //     ArrayList<Integer> arr =  new ArrayList<>();

    //     Node temp = head;

    //     while(temp != null){
    //         arr.add(temp.data);
    //         temp = temp.next;
    //     }

    //     Collections.sort(arr);

    //     temp = head;
    //     for(int i = 0; i < arr.size(); i++){
    //         temp.data = arr.get(i);
    //         temp = temp.next;
    //     } 

    //     return head;
    // }

    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeTwoList(Node list1, Node list2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }

        if(list1 != null) temp.next = list1;
        else temp.next = list2;

        return dummyNode.next;
    }

    public Node sort(Node head){
        if(head == null || head.next == null) return head;

        Node middle = findMiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        left = sort(left);
        right = sort(right);
        return mergeTwoList(left, right);
    }


    static void printLinkedList(Node head) {
        // Pointer to traverse list
        Node temp = head;

        // Traverse and print values
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 3 -> 2 -> 5 -> 4 -> 1
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        // Print original list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Create Solution object
        sortList obj = new sortList();

        // Sort the linked list
        head = obj.sort(head);

        // Print sorted list
        System.out.print("Sorted Linked List: ");
        printLinkedList(head);
    }
}
