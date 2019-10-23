package com.karl.leetcode.recusion;

/**
 * @program: leetCode
 * @description: 递归调用机制案例分析
 * @author: Ma.Han
 * @create: 2019-10-23 21:46
 **/
public class RecusionTest {
    public static void main(String[] args) {
        test(4);
    }

    public static int count = 0;

    public static void test(int n) {
        count++;
        System.out.println("第" + count + "次调用test方法");
        if (n > 2) {
            test(n - 1);
        }
        System.out.println(n);
    }
}