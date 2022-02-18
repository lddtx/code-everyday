package com.code.codeeveryday.leetcode;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * 题目描述
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 *
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 * 解法
 * 用一个哈希表作为字符计数器，O(n) 时间内解决。
 */
public class Permutation {
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = checkPermutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }

    public static boolean checkPermutation(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2) {
            return false;
        }
        int[] counter = new int[128];
        for (int i = 0; i < n1; i++) {
            ++counter[s1.charAt(i)];
            --counter[s2.charAt(i)];
        }
        for (int v : counter) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
