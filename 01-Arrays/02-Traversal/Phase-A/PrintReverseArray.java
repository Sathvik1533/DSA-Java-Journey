/*
Pattern : Traversal

Problem : Print Reverse Array Elements

Difficulty : Easy
*/

public class PrintReverseArray {
  public static void main(String a[]){
    int [] arr={11,7,25,4};
    for(int i=arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
    }
  }
}
