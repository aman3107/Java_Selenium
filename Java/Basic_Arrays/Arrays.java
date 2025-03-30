package Java.Basic_Arrays;

import java.util.*;

public class Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Solution sol = new Solution();
    // System.out.println(sol.sum(arr, n));
    // System.out.println(sol.countOdd(arr, n));
    // sol.reverse(arr, n);
    System.out.println(sol.arraySortedOrNot(arr, n));
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}

class Solution {
  public int sum(int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public int countOdd(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 != 0) {
        count++;
      }
    }
    return count;
  }

  public void reverse(int[] arr, int n) {
    int i = 0;
    int j = n - 1;
    while (i < j) {
      int val = arr[i];
      arr[i] = arr[j];
      arr[j] = val;
      i++;
      j--;
    }
  }

  public boolean arraySortedOrNot(int[] arr, int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i - 1] > arr[i]) {
        return false;
      }
    }
    return true;
  }
}
