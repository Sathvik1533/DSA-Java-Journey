public class print3rdElement {
    public static void main(String args[]) {
        int arr[] = {12, 5, 9, 18, 7, 4, 15, 2, 20, 11};
        for (int i = 0; i < arr.length; i += 3) {
            System.out.println(arr[i]);
        }
    }
}
