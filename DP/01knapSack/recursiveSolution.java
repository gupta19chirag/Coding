import java.util.*;
class recursiveSolution{
    public static void main(String[] args){
       int wt[] = {1,3,1,4};
       int cost[] = {10,20,19,1};
       int n = wt.length;
       int W = 2;
       System.out.println(knapSack(wt,cost,W,n));
    }
    public static int knapSack(int wt[],int cost[],int W,int n){
        if(n == 0 || W == 0) return 0;
        if(wt[n-1] <= W){
            return Math.max(cost[n-1]+knapSack(wt,cost,W-wt[n-1],n-1),knapSack(wt,cost,W,n-1));
        }
        else{
            return knapSack(wt,cost,W,n-1);
        }
    }
}
// W is the capacity of the BAG
// n is the number of items
