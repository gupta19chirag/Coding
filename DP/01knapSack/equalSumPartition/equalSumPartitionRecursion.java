class equalSumPartitionRecursion{
 public static void main(String[] args){
  int ar[] = {1,2,3,4};
  int n = ar.length,sum = 0;
  for(int i=0;i<n;i++)
    sum += ar[i];
  if(sum / 2 == 0){
    System.out.println(knapSack(ar,n,sum/2));
  }
   else{
    System.out.println(false);
   }
 }
 static boolean knapSack(int ar[],int N,int sum){
       if(sum == 0) return true;
       if(N == 0) return false;
       if(ar[N-1] > sum) return knapSack(ar,N-1,sum);
       
       return (knapSack(ar,N-1,sum-ar[N-1]) || knapSack(ar,N-1,sum));
    }
}
