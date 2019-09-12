package com.Dynamicplanning;
//3、数组最大连续子序列和
public class MaxContinueArraySum {
    public static void main(String[] args) {
        int[] a={6,-1,3,-4,-6,9,2,-2,5};
        System.out.println(MaxContinueArraySum(a));
    }
    public static int MaxContinueArraySum(int a[]) {
        int n = a.length;
        int max = a[0];
        int sum = a[0];
        for(int i=1;i<n;i++){
            sum = Math.max(sum+a[i], a[i]);
            if(sum>=max){
                max = sum;
            }
        }
        return max;
    }
}
