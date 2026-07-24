/*
Pattern : Nested Triplet Loop
Problem : Print SubArrays Elements
Difficulty : Easy
*/
public class PrintSubArray {
    public static void main(String a[]){
        int [] arr= {2,5,1,9,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(arr[k]);
                }
            }
        }
    }
}
