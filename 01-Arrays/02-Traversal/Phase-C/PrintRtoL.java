public class PrintRtoL {
    public static void main(String a[]){
        int[] arr = {8, 15, 3, 21, 6, 11, 18, 5, 9, 14};
        int R = 8; 
        int L = 3;
        for(int i = R; i >= L; i--){
            System.out.println(arr[i]);
        }
    }
}
