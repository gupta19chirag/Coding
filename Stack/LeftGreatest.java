public class LeftGreatest {

	public static void main(String[] args) {
		int ar[] = {10,7,5,4,9,2,1,11,3};		
		solution(ar,9);
	}
	static void solution(int ar[], int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=0;i<n;i++) {
			while(!s.empty() && ar[i]>=s.peek()) {
				s.pop();
			}
			if(s.empty()) v.add(-1);
			else v.add(s.peek());
		s.push(ar[i]);
		}
		System.out.println(v);
	}

}
