package com.Array;

import java.util.Scanner;

//while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(a + b);
//        }
//
public class WYSolution1 {
    public static void main(String[] args) {
        Scanner in1=new Scanner(System.in);
        int n=in1.nextInt();
        Scanner in=new Scanner(System.in);
        //String s=in.nextLine();
        //String[] sa=s.split("\\s+");
        int[] array=new int[n];
        while (in.hasNextInt()){
            for (int i=0;i<n;i++)
             array[i]=in.nextInt();
            int q=in.nextInt();
            int[] numa=new int[q];
                for (int i = 0; i <q ; i++) {
                    numa[i]=in.nextInt();
                }
                float[] ranka=new float[q];
                for (int i = 0; i <q ; i++) {
                    float rank;
                    int temp=0;
                    for (int j=0;j<n;j++){
                        if (array[numa[i]-1]>=array[j])
                            temp++;
                    }
                    rank=(float) (temp-1)/n;
                    ranka[i]=rank;
                }
                for (int i=0;i<q;i++){
                    System.out.println(ranka[i]);
                }
        }
    }
}
