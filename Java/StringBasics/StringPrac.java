package Java.StringBasics;

import java.util.*;

public class StringPrac {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // Vector<Character> s = new Vector<>();
    // for (int i = 0; i < n; i++) {
    // Character ch = sc.next().charAt(0);
    // s.add(ch);
    // }
    Solution sol = new Solution();
    String s = sc.nextLine();
    String t = sc.nextLine();
    // String[] s = new String[n];
    // for (int i = 0; i < n; i++) {
    // s[i] = sc.nextLine();
    // }
    // sol.reverseString(s);
    // System.out.println(sol.palindromeCheck(s));
    // System.out.println(sol.largeOddNum(s));
    // System.out.println(sol.longestCommonPrefix(s));
    // System.out.println(sol.isomorphicString(s, t));
    // System.out.println(sol.rotateString(s, t));
    System.out.println(sol.anagramStrings(s, t));
    // for (char ch : s) {
    // System.out.println(ch);
    // }
    sc.close();
  }

}

class Solution {
  public void reverseString(Vector<Character> s) {
    // your code goes here
    int left = 0;
    int right = s.size() - 1;
    while (left < right) {
      char ch = s.get(right);
      s.set(right, s.get(left));
      s.set(left, ch);
      left++;
      right--;
    }
  }

  public boolean palindromeCheck(String s) {
    // your code goes here
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(right) != s.charAt(left)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public String largeOddNum(String s) {
    // your code goes here
    int index = 0;
    int i;
    for (i = s.length() - 1; i >= 0; i--) {
      if ((s.charAt(i) - '0') % 2 == 1) {
        index = i;
        break;
      }
    }
    i = 0;
    while (i <= index && s.charAt(i) == '0') {
      i++;
    }
    return s.substring(i, index + 1);
  }

  public String longestCommonPrefix(String[] str) {
    // your code goes here
    Arrays.sort(str);

    String ans = "";
    String first = str[0];
    String last = str[str.length - 1];
    for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
      if (first.charAt(i) == last.charAt(i)) {
        ans += first.charAt(i);
      } else {
        break;
      }
    }
    return ans;
  }

  public boolean isomorphicString(String s, String t) {
    // your code goes here
    if (s.length() != t.length()) {
      return false;
    }
    int[] hash1 = new int[26];
    int[] hash2 = new int[26];
    for (int i = 0; i < 26; i++) {
      hash1[i] = 0;
      hash2[i] = 0;
    }
    for (int i = 0; i < s.length(); i++) {
      if (hash1[s.charAt(i) - 'a'] != hash2[t.charAt(i) - 'a']) {
        return false;
      }
      hash1[s.charAt(i) - 'a']++;
      hash2[t.charAt(i) - 'a']++;
    }
    return true;
  }

  public boolean rotateString(String s, String goal) {
    // your code goes here
    s += s;
    return s.contains(goal);
  }

  public boolean anagramStrings(String s, String t) {
    // your code goes here
    if (s.length() != t.length()) {
      return false;
    }
    int[] hash1 = new int[26];
    int[] hash2 = new int[26];
    for (int i = 0; i < 26; i++) {
      hash1[i] = 0;
      hash2[i] = 0;
    }
    for (int i = 0; i < s.length(); i++) {
      hash1[s.charAt(i) - 'a']++;
      hash2[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (hash1[i] != hash2[i]) {
        return false;
      }
    }
    return true;
  }
}