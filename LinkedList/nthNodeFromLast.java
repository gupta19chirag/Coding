class Solution{
  int getNthFromList(Node head,int x){
    Node fast = head, slow = head;
    for(int i=0;i<x;i++){
      if(fast != null) fast = fast.next;
      else return -1; // The nth node to return is out of index or not available      
    }
    while(fast != null){
      fast = fast.next;
      slow = slow.next;
    } 
    return slow.data;
  }
}
