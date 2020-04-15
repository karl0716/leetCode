package com.karl.leetcode.bilibili;

/**
 * 描述:  连续整数求和
 *
 * @author mh
 * @create 2020-04-15 08:59
 */
public class ConsecutiveNumbersSum {

    public static void main(String[] args) {
        System.out.println("result:" + consecutiveNumbersSum(15));
    }


    /**
     *
     * @param num
     * @return
     */
    public static int consecutiveNumbersSum(int num){
        int ans = 0;
        for (int start = 1; start <= num; ++start) {
            int target = num, x = start;
            while (target > 0) {
                target = target - x;
                ++x;
                if(target == 0){
                    System.out.println("start:" + start);
                    System.out.println(x - 1);
                }
//                target -= x++;
            }
            if (target == 0) {
                ans++;
            }
        }
        return ans;
    }



    public static int consecutiveNumbersSum2(int N) {
        int ans = 0;
        for (int start = 1; start <= N ; start ++ ) {
            int mid = N , x = start;
            while(mid > 0 ){
                mid = mid - x;
                ++x;
            }
            if(mid == 0 ){
                ++ ans;
            }
        }
        return ans;
    }
}