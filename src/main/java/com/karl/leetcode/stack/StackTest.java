package com.karl.leetcode.stack;

/**
 * @program: leetCode
 * @description: 栈的测试类
 * @author: Ma.Han
 * @create: 2019-10-21 22:32
 **/
public class StackTest {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        int pop = arrayStack.pop();
        System.out.println(pop);
        arrayStack.list();
    }
}
