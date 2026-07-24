package Accumulation;

public class MinimumSubarrayBrute {
    public static void main(String a[]){
        int arr[]= {-5,-2,-8};
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int runningSum=0;
            for(int j=i;j<arr.length;j++){
                runningSum+=arr[j];
                minSum=Math.min(minSum,runningSum);
            }
        }
        System.out.println("Minimum Subarray = " + minSum);
    }
}
