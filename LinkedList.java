import java.util.Scanner;
public class LinkedList {
    class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
        }
    }
 
    Node head = null;
    Node tail = null;
 
public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
 
public static void main(String[] args) {
LinkedList list = new LinkedList();
Scanner sc = new Scanner(System.in);
 
System.out.println("Enter integers to create nodes (enter a non-integer to exit):");
 
while (sc.hasNextInt()) {
int data = sc.nextInt();
list.addNode(data);
        }
System.out.println("Linked List created");
 
System.out.println("Linked List Before Deleting");
list.displayList();
System.out.println("Deletion at Beginning");
list.deleteBegin();
System.out.println("Linked List After Deleting at Beginning");
list.displayList();
sc.close();
    }
public void deleteBegin()
{
    if(head==null){
        System.out.println("List is Empty");
    }
    else{
        Node temp=head;
        head=head.next;
        System.out.println("Deleted Element is:"+temp.data);
    }
}

    public void displayList() {
        Node current = head;
        while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
        }
System.out.println("null");
    }
 }