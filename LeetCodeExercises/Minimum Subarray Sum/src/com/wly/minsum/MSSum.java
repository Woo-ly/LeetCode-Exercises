package com.wly.minsum;
import java.util.Scanner;
public class MSSum {
    public static int main(String[] args) {
        int []nums;
        Scanner sc=new Scanner(System.in);
        //对数组进行键盘输入
        System.out.println("请输入数组长度：");
        int n=sc.nextInt();
        nums=new int[n];
        System.out.println("请输入数组元素：");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        //关键思路：当前最大连续和，要么是「前面的最大和 + 当前元素」，要么是「只取当前元素」，选大的。
        int childNum=nums[0];
        int maxNum=nums[0];
        for(int i=1;i<nums.length;i++){
            childNum=Math.max(nums[i],childNum+nums[i]);
            maxNum=Math.max(childNum,maxNum);
        }
        return maxNum;
    }
}
