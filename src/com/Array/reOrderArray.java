package com.Array;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
import java.util.Arrays;
import java.util.Scanner;

public class reOrderArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int[] a=new int[str.length];
        for (int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(str[i]);
        }
        int oddcount=0;
        int oddstart=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==1){
                oddcount++;
            }
        }
        int [] newarray=new int[a.length];
        for (int i=0;i<a.length;i++){
            if (a[i]%2==1){
                newarray[oddstart++]=a[i];
            }
            else {
                newarray[oddcount++]=a[i];
            }
        }
        System.out.println(Arrays.toString(newarray));
    }
}
