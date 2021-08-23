import java.util.*;
import java.util.Stack;

public class maxAreaHistogram {

	public static void main(String[] args) {
		int ar[] = {6,2,5,4,5,1,6}; 
		int n = ar.length;
		solution(ar,n);		
	}
	static void solution(int a[],int n) {
		//nsel 
		ArrayList<Integer> v = new ArrayList<Integer>();
		Stack<ArrayList<Integer>> s = new Stack<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			while(!s.empty() && a[i] <= s.peek().get(0)) {
				s.pop();
			}
			if(s.empty()) v.add(-1);
			else {
				v.add(s.peek().get(1));
			}
			ArrayList<Integer> t = new ArrayList<Integer>();
			t.add(a[i]);
			t.add(i);
			s.push(t);
		}		
		Integer a1[] = new Integer[n];
		a1 = v.toArray(a1);
		// nser
		for(int i=n-1;i>=0;i--) {
			while(!s.empty() && a[i] <= s.peek().get(0)) {
				s.pop();
			}
			if(s.empty()) v.add(-1);
			else {
				v.add(s.peek().get(1));
			}
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(a[i]);
			temp.add(i);
			s.push(temp);
		}
		Collections.reverse(v);
		Integer a2[] = new Integer[n];
		a2 = v.toArray(a2);
		Integer[] f = new Integer[n];
		int max = -1;
		for(int i=0;i<n;i++) {
			f[i] = a2[i] - a1[i] - 1;
			f[i] = f[i] * a[i];
			if(max < f[i]) {
				max = f[i];
			}
		}
		
		System.out.println(max);
	}	
}
