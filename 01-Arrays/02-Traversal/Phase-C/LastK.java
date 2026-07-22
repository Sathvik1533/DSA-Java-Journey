public class LastK { //K=4
    public static void main(String a[]){
        int[] arr = {8, 15, 3, 21, 6, 11, 18, 5, 9, 14};
        int k=4;
        for(int i=arr.length-k;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
