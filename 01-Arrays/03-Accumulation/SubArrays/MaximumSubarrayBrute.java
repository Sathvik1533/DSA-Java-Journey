package Accumulation;

public class MaximumSubarrayBrute {
    public static void main(String a[]){
        int arr[]= {-5,-2,-8};
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int runningSum=0;
            for(int j=i;j<arr.length;j++){
                runningSum+=arr[j];
                maxSum=Math.max(maxSum,runningSum);
            }
        }
        System.out.println("The Largest Subarray is " + maxSum);
    }
}
