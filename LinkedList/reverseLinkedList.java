class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, nex = null, cur = head;
        while(cur != null){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        head = pre;
        return head;
    }
}
