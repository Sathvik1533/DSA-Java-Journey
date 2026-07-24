/*
Pattern : Nested Array Traversal
Problem : Print all pairs of Array Elements
Difficulty : Easy
*/
public class PrintAllPairs {
    public static void main(String a[]) {
        int[] arr = {2,5,1,9,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }
}
