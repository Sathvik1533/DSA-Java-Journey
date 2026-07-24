/*
Pattern : Accumulation
Problem : Print Sum of every SubArray Elements
Difficulty : Easy
*/
public class PrintSumSubArray {
    public static void main(String a[]){
        int [] arr= {2,5,1,9,6};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                System.out.println(sum);
            }
        }
    }
}
