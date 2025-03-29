package Java.MathsBasic;

import java.util.*;

public class Maths {
  public static void main(String[] args) {
    Solution sol = new Solution();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int m = sc.nextInt();
    // System.out.println(sol.countDigit(n));
    // System.out.println(sol.countOddDigit(n));
    // System.out.println(sol.reverseNumber(n));
    // System.out.println(sol.isPalindrome(n));
    // System.out.println(sol.largestDigit(n));
    // System.out.println(sol.factorial(n));
    // System.out.println(sol.isArmstrong(n));
    // System.out.println(sol.isPerfect(n));
    // System.out.println(sol.isPrime(n));
    // System.out.println(sol.primeUptoN(n));
    // System.out.println(sol.GCD(n, m));
    int[] ans = sol.divisors(n);
    for(int i = 0; i <  ans.length; i++){
      System.out.println(ans[i]);
    }
  }
}

class Solution {
  public int countDigit(int n) {
    int count = (int) (Math.log10(n) + 1);
    return count;
  }

  public int countOddDigit(int n) {
    int count = 0;
    while (n > 0) {
      if (n % 2 != 0) {
        count++;
      }
      n /= 10;
    }
    return count;
  }

  public int reverseNumber(int n) {
    int reverseNum = 0;
    while (n > 0) {
      int digit = n % 10;
      reverseNum = reverseNum * 10 + digit;
      n = n / 10;
    }
    return reverseNum;
  }

  public boolean isPalindrome(int n) {
    int revNum = 0;
    int copy = n;
    while (copy > 0) {
      int digit = copy % 10;
      revNum = revNum * 10 + digit;
      copy = copy / 10;
    }
    return revNum == n;
  }

  public int largestDigit(int n) {
    int max = 0;
    while (n > 0) {
      if (n % 10 > max) {
        max = n % 10;
      }
      n = n / 10;
    }
    return max;
  }

  public int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public boolean isArmstrong(int n) {
    int armstrongNum = 0;
    int copy = n;
    int count = countDigit(n);
    while (n > 0) {
      int digit = n % 10;
      armstrongNum += (int) Math.pow(digit, count);
      n = n / 10;
    }
    return armstrongNum == copy;
  }

  public boolean isPerfect(int n) {
    if (n == 1) {
      return false;
    }
    int count = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        count = count + i;
        if (n / i != i && n / i != n) {
          count = count + (n / i);
        }
      }
    }
    return count == n;
  }

  public boolean isPrime(int n) {
    // your code goes here
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int primeUptoN(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (isPrime(i)) {
        count += 1;
      }
    }
    return count;
  }

  public int GCD(int n1, int n2) {
    while (n1 != 0 && n2 != 0) {
      if (n1 > n2) {
        n1 = n1 % n2;
      } else {
        n2 = n2 % n1;
      }
    }
    if (n1 == 0) {
      return n2;
    }
    return n1;
  }

  public int[] divisors(int n) {
    int[] al = new int[n];
    int c = 0;
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        al[c++] = i;
        if (n / i != i) {
          al[c++] = n / i;
        }
      }
    }
    int[] ans = Arrays.copyOf(al, c);
    Arrays.sort(ans);
    return ans;
  }
}