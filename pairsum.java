/* Problem: Given an array of integers, find two elements whose sum is closest to zero.

Input:
- First line: integer n
- Second line: n space-separated integers

Output:
- Print the pair of elements whose sum is closest to zero

Example:
Input:
5
1 60 -10 70 -80

Output:
-10 1

Explanation: Among all possible pairs, the sum of -10 and 1 is -9, which is the closest to zero compared to other pairs.*/
import java.util.*;
class pairsum{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);

       int left=0;
       int right=n-1;
       int first=0;
       int second=0;
       int totalsum=Integer.MAX_VALUE;
       while(left<right){
          int sum=arr[left]+arr[right];

          if(Math.abs(sum)<totalsum){
            totalsum=Math.abs(sum);
            first=arr[left];
            second=arr[right];
          }

          if(sum<0){
            left++;
          }
          if(sum>0){
            right--;
          }

       }

       System.out.println(first +" "+ second);


    }
}