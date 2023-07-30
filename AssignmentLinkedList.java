import java.util.*;
import java.util.LinkedList;
public class AssignmentLinkedList {
    public static Node head;
    public static Node tail;
    public static int size;
    public static class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void InsertionATEnd(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void InsertionAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    // Printing the linkedlist
    public static void PrintLLL(){
        Node temp = head;
        if(head == null){
            System.out.println("Your linked list is empty..");
        }
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Question no. 1...
    // Performing searching of the given key using recursion...
    public static int SearchRecu(int key){
        return helper(head, key);
    }
    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        else if (head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    // Question no. 2....
    // Insertion of a node at any given point...
    public static void InsertAtGivenPoint(int data, int idx){
        Node newNode = new Node(data);
        Node prev = head;
        for(int i = 0; i < idx -1; i++){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        
    }

    // Question no. 3..
    // Delelting the duplicates from the given linked list....
    public static void DeleteDuplicate(){
        Node prev = head;
        while(prev.next != null){
            if(prev.data == prev.next.data){
                int val = prev.next.data;
                prev.next = prev.next.next;
            }
            else{
            prev= prev.next;
            }
        }
    }

    // Question . no. 4....
    // Checking if the given linked list is palindrome or not.....
    public static boolean Palindrome(){
        Node mid = getMid();
        Node curr = mid;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        while(rightHead != null){
            if(leftHead.data != rightHead.data){
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }
    public static Node getMid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Question no. 5....
    // taking the sum of two number and printing the sum as linked list...
    // This question is solved using collection frameworks......
    
    public static void SumOfLinkedList(int n, int n1){
        int sum = n + n1;
        // AssignmentLinkedList ll = new AssignmentLinkedList();
        LinkedList<Integer> ll = new LinkedList<>();
        while(sum > 0){
            ll.addFirst(sum%10);
            sum /= 10;
        }
        for(int i : ll){
            System.out.print(i + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AssignmentLinkedList ll = new AssignmentLinkedList();
        // ll.InsertionATEnd(1);
        // // ll.InsertionATEnd(1);
        // ll.InsertionATEnd(2);
        // // ll.InsertionATEnd(2);
        // ll.InsertionATEnd(3);
        // // ll.InsertionATEnd(3);
        // // ll.InsertionATEnd(4);
        // ll.InsertionATEnd(4);
        // // ll.InsertionATEnd(5);
        // ll.InsertionATEnd(3);
        // ll.InsertionATEnd(2);
        // ll.InsertionATEnd(1);
        // ll.PrintLLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number...");
        int secondNumber = sc.nextInt();
        ll.SumOfLinkedList(firstNumber, secondNumber);
        // ll.PrintLLL();
        // System.out.println("Please enter the value you want to insert in the linked list..");
        // int value = sc.nextInt();
        // System.out.println("Please enter the index number where you want to add the value..");
        // int idx = sc.nextInt();
        // ll.InsertAtGivenPoint(value, idx);
        // ll.DeleteDuplicate();
        // System.out.println(ll.Palindrome());
        // ll.PrintLLL();
        // System.out.println("Please enter the number you want to search the index for....");
        // int input = sc.nextInt();
        // int result = SearchRecu(input);
        // System.out.println("Your number is found at :: " + result);
    }   
}
