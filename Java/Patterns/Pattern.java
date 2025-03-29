package Java.Patterns;
import java.util.*;
public class Pattern {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Solution sol = new Solution();
    // sol.pattern1(n);
    // sol.pattern2(n);
    // sol.pattern3(n);
    // sol.pattern4(n);
    // sol.pattern5(n);
    // sol.pattern6(n);
    // sol.pattern7(n);
    // sol.pattern8(n);
    // sol.pattern9(n);
    // sol.pattern10(n);
    // sol.pattern11(n);
    // sol.pattern12(n);
    // sol.pattern13(n);
    // sol.pattern14(n);
    // sol.pattern15(n);
    // sol.pattern16(n);
    // sol.pattern17(n);
    // sol.pattern18(n);
    // sol.pattern19(n);
    // sol.pattern20(n);
    sol.pattern21(n);
    sc.close();
  }

}

class Solution {

     public void pattern1(int n) {
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
   public void pattern2(int n) {
      for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public void pattern3(int n) {
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(j);
        }
        System.out.println();
      }
    }
    public void pattern4(int n) {
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(i);
        }
        System.out.println();
      }
    }
    public void pattern5(int n) {
      for(int i = 0; i < n; i++){
        for(int j = n-i; j > 0; j--){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public void pattern6(int n) {
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i+1; j++){
          System.out.print(j);
        }
        System.out.println();
      }
    }
    public void pattern7(int n) {
      for(int i = 1; i <= n; i++){
        for(int spaces = 0; spaces < n-i; spaces++){
          System.out.print(" ");
        }
        for(int j = 0; j < 2*i-1; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public void pattern8(int n) {
      for(int i = 1; i <= n; i++){
        for(int spaces = 1; spaces < i; spaces++){
          System.out.print(" ");
        }
        for(int j = 1; j <= 2*(n-i)+1; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    public void pattern9(int n) {
      pattern7(n);
      pattern8(n);
    }
    public void pattern10Helper1(int n){
      for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
          System.out.print("*");
        }
        for(int spaces = 0; spaces < n-i-1; spaces++){
          System.out.print(" ");
        }
        System.out.println();
      }
    }
    public void pattern10Helper2(int n){
      for(int i = 0; i < n; i++){
        for(int j = 0; j < n-i; j++){
          System.out.print("*");
        }
        for(int spaces = 0; spaces < i; spaces++){
          System.out.print(" ");
        }
        System.out.println( );
      }
    }
    public void pattern10(int n) {
      pattern10Helper1(n);
      pattern10Helper2(n-1);
    }
    public void pattern11(int n) {
      for(int i = 1; i <= n; i++){
        int start = 1;
        if(i % 2 == 0){
          start = 0;
        }
        for(int j = 1; j <= i; j++){
          System.out.print(start);
          start = 1  - start;
        }
        System.out.println();
      }
    }
    public void pattern12(int n) {
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(j);
        }
        for(int spaces = 1; spaces <= 2*(n - i); spaces++){
          System.out.print(" ");
        }
        for(int j = i; j > 0; j--){
          System.out.print(j);
        }
        System.out.println();
      }
    }
    public void pattern13(int n) {
      int num = 1;
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(num +" ");
          num+=1;
        }
        System.out.println();
      }
    }
    public void pattern14(int n) {
      for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
          int ch = (int)'A'+j;
          System.out.print((char)ch);
        }
        System.out.println();
      }
    }
    public void pattern15(int n) {
      for(int i = 0; i < n; i++){
        for(char ch = 'A'; ch <= 'A' +(n-i-1); ch++){
          System.out.print(ch);
        }
        System.out.println();
      }
    }
    public void pattern16(int n) {
      for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
          System.out.print((char)('A'+i));
        }
        System.out.println();
      }
    }
    public void pattern17(int n) {
      for(int i = 1; i <= n; i++){
        for(int spaces = 1; spaces <= n-i; spaces++){
          System.out.print(" ");
        }
        char ch = 'A';
        for(int j = 1; j <= i; j++){
          ch = (char)('A'+j-1);
          System.out.print(ch);
        }
        
        for(int k = 1; k < i; k++){
          ch = (char)(ch - 1);
          System.out.print(ch); 
        }
        System.out.println();
      }
    }
    public void pattern18(int n) {
      for(int i = 0; i < n; i++){
         char ch = (char)('A'+(n-i-1));
        for(int j =  0; j <= i; j++){
          System.out.print(ch);
          ch = (char)(ch+1);
        }
        System.out.println();
      }
    }

    public void pattern19Helper1(int n){
      for(int i = 0; i < n; i++){
        for(int j = 1; j <=n-i; j++){
          System.out.print("*");
        }
        for(int spaces = 0; spaces < 2*i; spaces++){
          System.out.print(" ");
        }
        for(int j = 1; j <=n-i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }

    public void pattern19Helper2(int n){
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <=i; j++){
          System.out.print("*");
        }
        for(int spaces = 1; spaces <= 2*(n-i); spaces++){
          System.out.print(" ");
        }
        for(int j = 1; j <=i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }

    public void pattern19(int n) {
      pattern19Helper1(n);
      pattern19Helper2(n);
    }

    public void pattern20Helper1(int n) {
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        for(int spaces = 1; spaces <= 2*(n-i); spaces++){
          System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }

    public void pattern20Helper2(int n) {
      for(int i = n; i > 0; i--){
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        for(int spaces = 1; spaces <= 2*(n-i+1); spaces++){
          System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }

    public void pattern20(int n) {
      pattern20Helper1(n);
      pattern20Helper2(n-1);
    }

    public void pattern21(int n) {
      for(int i = 0; i < n; i++){
        for(int j = 0;  j < n; j++){
          if(i == 0 || j ==  0  || i == n-1 || j == n - 1){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
  };
