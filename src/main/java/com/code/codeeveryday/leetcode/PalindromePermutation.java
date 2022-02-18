package com.code.codeeveryday.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.04. 回文排列
 *
 * 题目描述
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 *
 *
 * 示例1：
 *
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 *
 *
 * 解法
 * 用哈希表存储每个字符出现的次数。若次数为奇数的字符超过 1 个，则不是回文排列。
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "tactcoa";
        System.out.println(str + "is Palindrome Permutation: " + isPalindromePermutation(str));
    }

    public static boolean isPalindromePermutation(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : str.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int cnt = 0;
        for (Integer v : counter.values()) {
            cnt += v%2;
        }
        return cnt < 2;
    }
}
