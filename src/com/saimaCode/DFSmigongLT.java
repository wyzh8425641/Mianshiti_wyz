package com.saimaCode;

import java.util.*;
public class DFSmigongLT {
    static int[][] datas = null;
    static int[][] move = {{0,1},{1,0},{-1,0},{0,-1}};
    static int result = 0;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startX=0,startY=0;
        String temp = null;
        datas = new int[n+2][n+2];
        for(int i=1;i<=n;i++){
            temp = sc.next();
            for(int j=1;j<=n;j++){
                char techar = temp.charAt(j-1);
                switch(techar){
                    case 'S':
                        datas[i][j] = 1;startX=i;startY=j;break;
                    case 'E':
                        datas[i][j] = 4;break;
                    case '.':
                        datas[i][j] = 2;break;
                    case '#':
                        datas[i][j] = 3;break;
                }
            }
        }
        int count=0;
        dfs(startX,startY,count);
        System.out.print(min);
    }

    public static void dfs(int x,int y,int count){
        if(datas[x][y]==4){//如果走到了终点，数目加1
            result+=1;
            if (count<min){
                min=count;
            }
            return ;
        }else{

            for(int i=0;i<4;i++){  //尝试四个方向
                datas[x][y] = 0;   //标记这个位置走过了，因为一个位置只能走一次
                if(datas[x+move[i][0]][y+move[i][1]]==2||datas[x+move[i][0]][y+move[i][1]]==4){
                    dfs(x+move[i][0],y+move[i][1],count+1);
                }
                datas[x][y] = 2;   //回溯，因为2代表可以走
            }
        }
    }
}
