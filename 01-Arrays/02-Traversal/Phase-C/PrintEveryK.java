public class PrintEveryK{ //K=3
    public static void main(String a[]){
        int[] arr = {8, 15, 3, 21, 6, 11, 18, 5, 9, 14};
        int k=3;
        for(int i=0;i<arr.length;i+=3){
            System.out.println(arr[i]);
        }
    }
}
