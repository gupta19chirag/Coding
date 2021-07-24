import java.util.*;
class subSetSumMemoizied{
    static boolean t[][] = new boolean[102][1002];
    
    public static void main(String[] args){
       int wt[] = {3,34,4,12,5,2};
       for(boolean[] row: t){
        Arrays.fill(row,false);
       }
       int n = wt.length;
       int sum = 90;
       System.out.println(knapSack(wt,n,sum));
    }
    public static boolean knapSack(int wt[],int n,int sum){
        if(n == 0) return false;
        if(sum == 0) return true;
        if(t[n][sum] != false) return true;
        if(wt[n-1] <= sum){
            return t[n][sum] = (knapSack(wt,n-1,sum-wt[n-1]) || knapSack(wt,n-1,sum));
        }
        else{
            return t[n][sum] = knapSack(wt,n-1,sum);
        }
    }
}
