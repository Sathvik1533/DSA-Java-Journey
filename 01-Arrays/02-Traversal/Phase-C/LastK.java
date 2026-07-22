public class LastK { //K=4
    public static void main(String a[]){
        int[] arr = {8, 15, 3, 21, 6, 11, 18, 5, 9, 14};
        int mid=arr.length/2;
        for(int i=mid-1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
