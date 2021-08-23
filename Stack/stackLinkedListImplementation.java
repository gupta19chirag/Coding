class stackLinkedListImplementation{
  //public static int MAX = 1000;
  static Node root;
  int top;  
  stackLinkedListImplementation(){
    root = null;
  }
  boolean isEmpty(){
   if(root == null){
    return true;
   }
    return false;
  }  
  void push(int key){
    Node temp = new Node(key);
    temp.next = root;
    root = temp;
  }
  int pop(){
    int del = Integer.MIN_VALUE;
    if(isEmpty()){      
    }
    else{
      del = root.val;
      root = root.next;
    }
    return del;
  }
  int peek(){
    int topEle = Integer.MAX_VALUE;
    if(isEmpty()) 
    else topEle = root.val;
    return topEle;
  }
public static void main(String[] args){
  stackLinkedListImplementation stack = new stackLinkedListImplementation();
    stack.push(10);
    System.out.println(stack.pop());
  }
}
class Node{
  int val;
  Node temp;
  Node(int key){
    val = key;
    temp = null;
  }
}
