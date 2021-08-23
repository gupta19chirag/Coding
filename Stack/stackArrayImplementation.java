class stackArrayImplementation{
  static int final MAX = 1000;
  int top;
  int a[] = new int[MAX];
  stackArrayImplementation(){
    top = -1;
  }
  boolean isEmpty(){
    if(top < 0) return true;
    return false;
  }
  boolean isFull(){
   if(top >= MAX-1) return true;
    return false;
  }
  boolean push(int b){
    if(isFull()){
      return false;
    }
    a[++top] = b;
      return true;    
  }
  int pop(){    
    if(isEmpty()){
      return -1;
    }
    int d = a[top];
    top--;
    return d;
  }
  int peek(){
    if(isEmpty()){
      return -1;
    }
    int peekEle = a[top];
    return peekEle;
  }
  public static void main(String args[]){
    stackArrayImplementation stack = new stackArrayImplementation();
    stack.push(10);
    stack.push(20);
    int temp = stack.pop();
    System.out.println("Deleted Element is:"+temp);
  }
}
