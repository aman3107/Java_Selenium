package Java.Basics_Prac;
import java.util.Scanner;

class Basics_Prac{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution sol = new Solution();
    String str = sc.nextLine();
    System.out.println(sol.lastChar(str));
    // int n= sc.nextInt();
    // int x = sc.nextInt();
    // sol.printX(x, n);
    // sol.printNumber(n);
    // sol.isAdult(n);
    // int[] arr = new int[n];
    // for(int i = 0; i < n; i++){
    //   arr[i] = sc.nextInt();
    // }
    // System.out.println(sol.sumOfFirstAndLast(arr));
    sc.close();
  }
}
class Solution {
  public void printNumber(int num) {
      System.out.print(num);
  }
  public void isAdult(int age) {
    if(age >= 18){
      System.out.println("Adult");
    }
    else{
      System.out.println("Teen");
    }
  }
  public int sumOfFirstAndLast(int[] nums) {
    int size = nums.length;
    int sum = nums[0]+nums[size-1];
    return sum;
  }

  public void printX(int X, int N) {
    for(int i = 0; i < N; i++){
      if(i == N-1){
        System.out.print(X);
        continue;
      }
      System.out.print(X+" ");
    }
    System.out.println();
  }

  public char lastChar(String s) {
    //your code goes here
    return s.charAt(s.length()-1);
  }
}

