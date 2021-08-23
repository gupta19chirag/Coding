public class nextSmallerEleToRight {

	public static void main(String[] args) {
		long ar[] = {10,7,5,4,9,2,1,11,3};		
		solution(ar,9);
	}
	static void solution(long ar[],int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=n-1;i>=0;i--) {
			while(!s.empty() && ar[i]<=s.peek()) {
				s.pop();
			}
			if(s.empty()) v.add(-1);
			else v.add(s.peek());
		s.push((int)ar[i]);
		}
		Integer arr[] = new Integer[n];
		arr = v.toArray(arr);
		long[] A = new long[n];
		for(int i=0;i<n;i++) {
			A[i] = (long)arr[i];
		}
		System.out.println(v);
	}
}
