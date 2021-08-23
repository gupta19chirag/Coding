/*
Approach:-
Iterate through right take one stack and one arrayList
(stack is not empty and arra[i] >= s.peek()) then pop the stack until the condition fails
If now stack is empty so simply place -1 
else add the top elemnet of the stack that is array ele is small than the top element of the stack. 
*/
import java.util.*;
class nextGreaterElement{
  public static ArrayList<Integer> solution(int a[],int n){
    ArrayList<Integer> v = new ArrayList<Integer>;
    Stack<Integer> s = new Stack<>();
    for(int i=n-1;i>=0;i--){
      while(a[i]>=s.peek() && !s.empty()){
        s.pop();
      }      
      if(s.empty()){
        v.add(-1);
      }
      else{
        v.add(s.peek());
      }
      s.push(arr[i]);
    }
    Collections.reverse();
    return v;
  }
}
