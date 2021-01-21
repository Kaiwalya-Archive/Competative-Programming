//Revision of linked list

package QuickRecall;
import java.util.Scanner;

public class ReviseLL{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void add(int val){
            Node n  = new Node();
            n.data = val;
            n.next = null;
            if(size==0){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }

            size++;
        }

        void display(){
            for(Node temp = head; temp !=null ; temp = temp.next){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        System.out.println("Enter the number of elements in Linked List: ");
        int n = sc.nextInt();

        for(int i=0; i<n ; i++){
            int val = sc.nextInt();
            li.add(val);
        }

        li.display();
    }
}
