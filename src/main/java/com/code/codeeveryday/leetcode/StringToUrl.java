package com.code.codeeveryday.leetcode;

/**
 * 面试题 01.03. URL 化
 *
 * 题目描述
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。
 * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 示例1:
 *
 *  输入："Mr John Smith    ", 13
 *  输出："Mr%20John%20Smith"
 * 示例2:
 *
 *  输入："               ", 5
 *  输出："%20%20%20%20%20"
 * 提示：
 *
 * 字符串长度在[0, 500000]范围内。
 */
public class StringToUrl {
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        String str2 = "                ";
        System.out.println("replaceSpace string is: " + replaceSpace(str2, 5));
    }

    public static String replaceSpace(String str, int length) {
        final char[] chars = str.toCharArray();
        int j = chars.length;
        for (int i = length - 1; i >= 0 ; --i) {
            if (chars[i] == ' ') {
                chars[--j] = '0';
                chars[--j] = '2';
                chars[--j] = '%';
            } else {
                chars[--j] = chars[i];
            }
        }
        return new String(chars, j, chars.length - j);
    }
}
