import java.util.*;
class subSetSum{
    public static void main(String[] args){
       int wt[] = {3,34,4,12,5,2};       
       int n = wt.length;
       int sum = 2;
       System.out.println(knapSack(wt,n,sum));
    }
    public static boolean knapSack(int wt[],int n,int sum){
        if(n == 0) return false;
        if(sum == 0) return true;       
        if(wt[n-1] <= sum){
            return (knapSack(wt,n-1,sum-wt[n-1]) || knapSack(wt,n-1,sum));
        }
        else{
            return knapSack(wt,n-1,sum);
        }
    }
}
