/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {1,2,5,6,8,23};
		int b[] = {3,7,12,25};
		merge(a,b,a.length,b.length);
		for(int i=0;i<4;i++){
		    System.out.println(b[i]);
		}
	}
	static void merge(int a[],int b[],int n,int m){
	    int i,j,gap=n+m;
	    for(gap=gapCalculate(gap);gap > 0;gap = gapCalculate(gap)){
	       for(i=0;i+gap<n;i++){
	           if(a[i] > a[i+gap]){
	               int temp = a[i];
	               a[i] = a[i+gap];
	               a[i+gap] = temp;
	           }
	       }
	       for(j=gap>n?gap-n:0;i<n&&j<m;i++,j++){
	           if(a[i] > b[j]){
	               int temp = a[i];
	               a[i] = b[j];
	               b[j] = temp;
	           }
	       }
	       if(j < m){
	       for(j=0;j+gap<m;j++){
	           if(b[j] > b[j+gap]){
	               int temp = b[j];
	               b[j] = b[j+gap];
	               b[j+gap] = b[j];
	           }
	       }
	        }
	    }
	}
	static int gapCalculate(int gap){
	    if(gap <= 1) return 0;
	    return (gap%2) + (gap / 2);
	}
}
