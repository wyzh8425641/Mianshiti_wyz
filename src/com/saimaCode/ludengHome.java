package com.saimaCode;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

//路灯发光能力以正数d来衡量，其中d表示路灯能够照亮的街道上的点与路灯的最远距离，所有路灯发光能力相同。为了让V先生看清回家的路，路灯必须照亮整条街道，又为了节省电力希望找到最小的d是多少？
public class ludengHome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int[] array=new int[n];
            for (int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            Arrays.sort(array);
            double max=2*(array[0]-0);

            for (int i = 1; i < n; i++) {
                int temp=array[i]-array[i-1];
                if (temp>max){
                    max=temp;
                }
            }
            if (max<2*(l-array[n-1])){
                max=2*(l-array[n-1]);
            }
            DecimalFormat df=new DecimalFormat("#.00");
            System.out.println(df.format(max/2));
        }
    }
}
