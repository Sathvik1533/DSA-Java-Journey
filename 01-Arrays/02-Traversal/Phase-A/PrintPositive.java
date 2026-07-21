public class PrintPositive {
  public static void main(String a[]) {
    int[] arr = {5, -3, 0, 8, -1, 6};
    for (int i = 0; i <arr.length; i++) {
      if(arr[i]>0){
        System.out.println(arr[i]);
      }
    }
  }
}
