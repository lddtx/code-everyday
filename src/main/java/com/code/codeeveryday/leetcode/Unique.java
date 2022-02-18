package com.code.codeeveryday.leetcode;

/**
 * 面试题01.01判定字符是否唯一
 *
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 *
 * 限制：
 *
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 */
public class Unique {
    public static void main(String[] args) {
        String[] words = {"abca", "hello", "world"};
        for (String word : words) {
            System.out.println(word + "is unique: " + isUnique(word));
        }
    }

    public static boolean isUnique(String str) {
        int bitmap = 0;
        for (char c : str.toCharArray()) {
            int pos = c - 'a';
            if ((bitmap & (1 << pos)) != 0) {
                return false;
            }
            bitmap |= (1 << pos);
        }
        return true;
    }

}
