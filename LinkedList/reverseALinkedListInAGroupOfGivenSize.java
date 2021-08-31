class reverseALinkedListInAGroupOfGivenSize{
  static Node solution(Node head, int k){
    if(head == null) return null;
    Node curr = head;
    Node nex = null;
    Node pre = null;
    int c = 0;
    while(c < k && cur != null){
      nex = curr.next;
      cur.next = pre;
      pre = cur;
      cur = nex;
      c++;
    }
    if(nex != null){
      head.next = solution(nex,k);
    }
    return pre;
  }
}
class Node{
  int data;
  Node next;
  Node(int value){
    data = value;
    next = null;
  }
}
