public class KadaneAlgorithmMin {
    public static void main(String[] args) {
        int[] arr = {2, -5, 3, -4, 6, -2};
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.min(arr[i], currentSum + arr[i]);
            minSum = Math.min(minSum, currentSum);
        }
        
        System.out.println(minSum);
    }
}
