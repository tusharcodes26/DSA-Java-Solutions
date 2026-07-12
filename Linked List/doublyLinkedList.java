

class Node{
    int data;
    Node next;
    Node back;
    
    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class doublyLinkedList {

    private static Node convertArray2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head; 
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    // private static Node removeHead(Node head){
    //     if(head == null || head.next == null) return null;

    //     Node prev = head;
    //     head = head.next;
    //     head.back = null;
    //     prev.next = null;

    //     return head;
    // }

    // private static Node removeTail(Node head){
    //     if(head == null || head.next == null) return null;

    //     Node tail = head;
    //     while(tail.next != null){
    //         tail = tail.next;

    //     }
    //     Node prev = tail.back;
    //     prev.next = null;
    //     tail.back = null;
        
    //     return head;
    // }

    // private static Node removeKth(Node head, int k){
    //     if(head == null) return null;

    //     Node temp = head;
    //     int cnt = 0;

    //     while(temp != null){
    //         cnt++;
    //         if(cnt == k) break;
            
    //         temp = temp.next;
    //     }

    //     Node front = temp.next;
    //     Node prev = temp.back;

    //     if(front == null && prev == null){ 
    //         return null;
    //     }
    //     else if(prev == null){
    //         return removeHead(head);
    //     }
    //     else if(front == null){
    //         return removeTail(head);
    //     }
    //     prev.next = front;
    //     front.back = prev;

    //     temp.next = null;
    //     temp.back = null;

    //     return head;
    // }

    // private static void removeNode(Node temp){
    //     Node prev = temp.back;
    //     Node front = temp.next;

    //     if(front == null){
    //         prev.next = null;
    //         temp.back = null;
    //         return;
    //     }
    //     prev.next = front;
    //     front.back = prev;

    //     temp.next = temp.back = null;
    // }

    private static Node insertBeforeHead(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node insertBeforeTail(Node head, int val){
        if(head.next == null) return insertBeforeHead(head, val);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;

        return head;
    }

    private static Node insertAtEnd(Node head, int k){
        if(head == null) return new Node(k);

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        Node newNode = new Node(k, null, tail);
        tail.next = newNode;
        return head;
    }
    private static Node insertBeforeK(Node head, int el, int k){
            if(k == 1) return insertBeforeHead(head, el);

        Node temp = head;
        int cnt = 0;

        while(temp != null){
            cnt++;
            if(cnt == k){
                Node prev = temp.back;
                Node newNode = new Node(el, temp, prev);
                prev.next = newNode;
                temp.back = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static void insertBeforeNode(Node node, int val){
        Node prev = node.back;
        Node newNode = new Node(val, node, prev);
        prev.next = newNode;
        node.back = newNode;
    }

    // Brute Force
    // private static Node reverseDLL(Node head){
    //     if(head == null || head.next == null){
    //         return head;
    //     }

    //     Stack<Integer> st = new Stack<>();

    //     Node temp = head;

    //     while(temp != null){
    //         st.push(temp.data);
    //         temp = temp.next;
    //     }

    //     temp = head;

    //     while(temp != null){
    //         temp.data = st.pop();
    //         temp = temp.next;
    //     }
    //     return head;
    // }

    // optimal Solution
    private static Node reverseDLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        while(curr != null){
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;
            
            curr = curr.back;
        }
        return prev.back;
    }

    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,8};
        Node head = convertArray2DLL(arr);
        print(head);

        // head = removeHead(head);
        // print(head);

        // head = removeTail(head);
        // print(head);
        
        // head = removeKth(head, 2);
        // print(head);
        
        // removeNode(head.next.next.next);
        // print(head);

        head = insertBeforeHead(head, 1);
        print(head);
        
        head = insertBeforeK(head, 4, 4);
        print(head);
        
        insertBeforeNode(head.next.next.next.next, 5);
        print(head);

        head = insertBeforeTail(head, 7);
        print(head);
        
        head = insertAtEnd(head, 9);
        print(head);
        
        head = reverseDLL(head);
        print(head);
    }
}