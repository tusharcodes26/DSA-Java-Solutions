
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
public class linkedList {

    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i< arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthOfLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    private static boolean searchInLL(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    // private static Node removeHead(Node head){
    //     if(head == null) return head;
    //     head = head.next;
    //     return head;
    // }

    
    // private static Node removeTail(Node head){
    //     if(head == null || head.next  == null) return null;
        
    //     Node temp = head;
    //     while(temp.next.next != null){
    //         temp = temp.next;
    //     }
    //     temp.next = null;
    //     return head;
    // }

    // private static Node removeK(Node head, int k){
    //     if(head == null) return head;

    //     if(k==1){
    //         head = head.next;
    //         return head;
    //     }
    //     int cnt = 0;
    //     Node temp = head;
    //     Node prev = null;

    //     while(temp != null){
    //         cnt++;
    //         if(cnt == k){
    //             prev.next = prev.next.next;
    //             break;
    //         }
    //         prev = temp;
    //         temp = temp.next;
    //     }
    //     return head;
    // }

    // private static Node removeEl(Node head, int el){
    //     if(head == null) return head;

    //     if(head.data == el){
    //         head = head.next;
    //         return head;
    //     }
    //     Node temp = head;
    //     Node prev = null;

    //     while(temp != null){
    //         if(temp.data == el){
    //             prev.next = prev.next.next;
    //             break;
    //         }
    //         prev = temp;
    //         temp = temp.next;
    //     }
    //     return head;
    // }
    // private void removeNode(Node node){
    //     node.data = node.next.data;
    //     node.next = node.next.next;
    // }

    private static Node insertHead(Node head, int val){
        return new Node(val, head);
    }

    private static Node insertTail(Node head, int val){
        if(head == null) return new Node(val,head);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    private static Node insertK(Node head, int el, int k){
        if(head == null){
            if(k == 1) return new Node(el);
            else return head;
        }

        if(k == 1) return new Node(el, head);

        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == (k-1)){
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertBeforeK(Node head, int el, int k){
        if(head == null) return null;

        if(head.data == k) return new Node(el, head);

        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == k){
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node reverseLL(Node head){
        Node prev = null;
        Node temp = head;

        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
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
        int[] arr = {2,5,8,7};

        Node head = convertArr2LL(arr);
        print(head);

        System.out.println(lengthOfLL(head));
        System.out.println(searchInLL(head, 5));

        // head = removeHead(head);
        // print(head);

        // head = removeTail(head);
        // print(head);

        // head = removeEl(head, 5);
        // print(head);

        // Node node = head.next.next;
        // new linkedList().removeNode(node);
        // print(head);

        head = insertHead(head, 10);
        print(head);
        
        head = insertTail(head, 9);
        print(head);

        head = insertK(head, 4, 5);
        print(head);
        
        head = insertBeforeK(head, 6, 9);
        print(head);
        
        head = reverseLL(head);
        print(head);

    }
}

