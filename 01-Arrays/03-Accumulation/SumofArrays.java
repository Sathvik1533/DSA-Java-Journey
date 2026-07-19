/*
Pattern : Accumulation

Problem : Print Sum of Array Elements

Difficulty : Easy
*/
public class SumofArrays {
  public static void main(String a[]){
    int sum=0;
    int [] arr= {2,5,1,9,6};
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}
