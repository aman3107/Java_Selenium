package Java.BasicHashing;

import java.util.*;

public class HashingPrac {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    Solution sol = new Solution();
    // int ans = sol.mostFrequentElement(nums);
    // int ans = sol.secondMostFrequentElement(nums);
    int ans = sol.sumHighestAndLowestFrequency(nums);
    System.out.println(ans);
    sc.close();
  }
}

class Solution {
  public int mostFrequentElement(int[] nums) {
    int maxNum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (maxNum < nums[i]) {
        maxNum = nums[i];
      }
    }
    int[] hash = new int[maxNum + 1];
    for (int i = 0; i <= maxNum; i++) {
      hash[i] = 0;
    }
    for (int i = 0; i < nums.length; i++) {
      hash[nums[i]]++;
    }
    int max = 0;
    int ind = 0;
    for (int i = 0; i <= maxNum; i++) {
      if (max < hash[i]) {
        max = hash[i];
        ind = i;
      } else if (max == hash[i]) {
        ind = Math.min(ind, i);
      }
    }
    return ind;
  }

  public int secondMostFrequentElement(int[] nums) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
    }
    int maxFreq = 0;
    int secMaxFreq = 0;
    int maxEle = -1;
    int secMaxEle = -1;
    for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
      int ele = it.getKey();
      int freq = it.getValue();
      if (maxFreq < freq) {
        secMaxEle = maxEle;
        secMaxFreq = maxFreq;
        maxFreq = freq;
        maxEle = ele;
      } else if (freq == maxFreq) {
        maxEle = Math.min(ele, maxEle);
      } else if (freq > secMaxFreq) {
        secMaxFreq = freq;
        secMaxEle = ele;
      } else if (freq == secMaxFreq) {
        secMaxEle = Math.min(ele, secMaxEle);
      }
    }
    return secMaxEle;
  }

  public int sumHighestAndLowestFrequency(int[] nums) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
    }
    int minFreq = Integer.MAX_VALUE;
    int maxFreq = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
      int freq = it.getValue();
      if (freq > maxFreq) {
        maxFreq = freq;
      }
      if (freq < minFreq) {
        minFreq = freq;
      }
    }
    return minFreq + maxFreq;
  }
}
