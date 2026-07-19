public class PrintGreaterElement {
  public static void main(String a[]) {
    int x = 10;
    int[] arr = {5, 12, 7, 20, 3, 15};
    for (int i = 0; i <arr.length; i++) {
      if(arr[i]>x){
        System.out.println(arr[i]);
      }
    }
}
}
