package com.karl.leetcode.stack;

/**
 * @program: leetCode
 * @description: 用数组模拟栈的操作
 * @author: Ma.Han
 * @create: 2019-10-21 21:39
 **/
public class ArrayStack {

    private int maxSize;
    private int[] stack;
    private int index = -1;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    //判断栈是否为空

    public boolean isEmpty(){
        return index == -1;
    }

    //判断栈是否满

    public boolean isFull(){
        return index == maxSize - 1;
    }


    // 入栈操作

    public void push(int value){
        if(isFull()){
            throw new RuntimeException("栈已经满 无法进行入栈操作");
        }
        index++;
        stack[index] = value;
    }

    // 出栈操作

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈为空，无法进行出栈操作");
        }
        int value = stack[index];
        index--;
        return value;
    }


    public void list(){
        if(isEmpty()){
            System.out.println("栈为空");
            return;
        }
        for (int i = index; i >=0 ; i--) {
            System.out.println(stack[i]);
        }

//        for (int i = 0; i <= index ; i++) {
//            System.out.println(stack[i]);
//        }

    }


}
