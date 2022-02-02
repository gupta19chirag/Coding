//T.C = O(n1 + n2)
//S C = O(n1 + n2)
 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f = new ListNode(0);
        ListNode dummyF = f;
        if(list1==null) return list2;
        if(list2==null) return list1;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                dummyF.next = list1;
                list1 = list1.next;
            }else{
                dummyF.next = list2;
                list2 = list2.next;
            }
            dummyF = dummyF.next;
        }
        while(list1!=null){
            dummyF.next = list1;
            list1 = list1.next;
            dummyF = dummyF.next;
        }
        while(list2!=null){
            dummyF.next = list2;
            list2 = list2.next;
            dummyF = dummyF.next;
        }
        return f.next;
    }
