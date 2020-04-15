package com.karl.leetcode.fib;

/**
 * 描述:  斐波那契数
 * 0 1 1 2 3 5 8 13.....
 *
 * @author mh
 * @create 2020-02-06 12:21
 */
public class FibNum {

    public static void main(String[] args) {
        System.out.println(fib01(3));
        System.out.println(fib2(3));
    }


    /**
     * 递归
     *
     */
    public static int fib01(int n) {
        if (n <= 1) {
            return n;
        }
        return fib01(n - 1) + fib01(n - 2);
    }

    /**
     * 循环
     */
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}


