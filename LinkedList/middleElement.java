class Node{
  int data;
  Node head = null;
  Node(int i){
    val = i;
  }
}
// Fast and slow pointer approach
class Solution {
    public int middleNode(ListNode head) {
        ListNode fast,slow; 
        fast = head;
        slow = head;
        if(head.next == null){
            return head.data;
        }
        do{
            fast = fast.next.next;
            slow = slow.next;
        }while(fast!=null && fast.next!=null);
        return slow.data;
    }
}
