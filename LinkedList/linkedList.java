class Node{
  int data;
  Node next;
  Node(int key){
    data = key;
    next = null;
  }
}
class LinkedListInsertion{
  static Node head;
  LinkedListIsertion(){
    head = null;
  }
  void printLinkedList(){
    Node h = head;
    while(h != null){
      System.out.print(h.data+" ");
      h = h.next;
    }    
  }
  void InsertionAtEnd(int key){
    Node h = head;
    if(h == null){
      Node temp = new Node(key);
      temp.next = null;
      head = temp;
    }
    else{
      while(h.next != null){
        h = h.next;        
      }
      Node temp = new Node(key);
      temp.next = null;
      h.next = temp;
    }
  }
}
 public class linkedList{
  public static void main(String args[]){
    LinkedListInsertion list = new LinkedListInsertion();
    list.head = new Node(1);
    list.head.next = new Node(2);
    list.head.next.next = new Node(3);
    // This will be very tedious task as we have to go deep to add an element. So we will declare function for it
    list.InsertionAtEnd(12);
    list.printList();
  }
}

// Output will be:-    1 2 3 12
