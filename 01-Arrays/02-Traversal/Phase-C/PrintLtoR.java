public class PrintLtoR{ //K=3
    public static void main(String a[]){
        int[] arr = {8, 15, 3, 21, 6, 11, 18, 5, 9, 14};
        int L=2; 
        int R=8;
        int K=1;
        for(int i=L;i<=R;i+=K){
            System.out.println(arr[i]);
        }
    }
}
