import java.util.ArrayList;
import java.util.Stack;

/*
 * int ar[] = {100,80,60,70,60,75,85};
		int n = 7;
		int a[] = new int[7];
		a[0] = 1;
		System.out.print(a[0] +" ");
		int c;
		for(int i=1;i<7;i++){
		    c = 1;
		    for(int j=i-1;j>=0;j--){
		        if(ar[j] <= ar[i]){
		            c++;
		        }
		        if(ar[j] > ar[i]){
		            break;
		        }
		    }
		    a[i] = c; 
		    System.out.print(a[i]+" ");
        */
public class StockSpanProblem {
	public static void main(String[] args) {
		int ar[] = {100,80,60,70,60,75,85};		
		solution(ar,7);
	}

	static void solution(int ar[],int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<ArrayList<Integer>> s = new Stack<ArrayList<Integer>>();
		ArrayList<Integer> span = new ArrayList<>();
		for(int i=0;i<n;i++) {
			while(!s.empty() && ar[i]>=s.peek().get(0)) {
				s.pop();
			}
			if(s.empty()) v.add(-1);
			else v.add(s.peek().get(1));
		ArrayList<Integer> tempList = new ArrayList<>();
		tempList.add(ar[i]);
		tempList.add(i);
		s.push(tempList);
		}
		for(int i=0;i<n;i++) {
			span.add(i-v.get(i));
			System.out.print(span.get(i));
		}
		
	}

}
