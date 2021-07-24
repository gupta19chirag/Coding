import java.util.*;
class memoization{
    static int t[][] = new int[102][1002];
    
    public static void main(String[] args){
       int wt[] = {1,3,1,4};
       for(int[] row: t){
        Arrays.fill(row,-1);
       }
       int cost[] = {10,20,19,1};
       int n = wt.length;
       int W = 2;
       System.out.println(knapSack(wt,cost,W,n));
    }
    public static int knapSack(int wt[],int cost[],int W,int n){
        if(n == 0 || W == 0) return 0;
      //This line is added new. As whenever the previously stored call is encounterd the matrix will provide the result.
        if(t[n][W] != -1) return t[n][W];
        if(wt[n-1] <= W){
            return t[n][W] = Math.max(cost[n-1]+knapSack(wt,cost,W-wt[n-1],n-1),knapSack(wt,cost,W,n-1));
        }
        else{
            return t[n][W] = knapSack(wt,cost,W,n-1);
        }
    }
}
