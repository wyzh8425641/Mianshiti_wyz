package com.saimaCode;

import java.util.*;
public class DFSmigong {
    static int[][] datas = null;
    static int[][] move = {{0,1},{1,0},{-1,0},{0,-1}};
    static int result = 0;
    static int min =Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int startX=0,startY=0;
        String temp = null;
        datas = new int[n][m];
        for (int i=0;i<k;i++){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            datas[a1][a2]=1;
        }
//        for(int i=1;i<=n;i++){
//            temp = sc.next();
//            for(int j=1;j<=m;j++){
//                char techar = temp.charAt(j-1);
//                switch(techar){
//                    case 'S':
//                        datas[i][j] = 1;startX=i;startY=j;break;
//                    case 'T':
//                        datas[i][j] = 4;break;
//                    case '.':
//                        datas[i][j] = 2;break;
//                    case '#':
//                        datas[i][j] = 3;break;
//                }
//            }
//        }
        int count=0;
        dfs(startX,startY,n,m,count);
        System.out.print(min);
    }

    public static void dfs(int x,int y,int n,int m,int count){
        if(x==n&&y==m){//如果走到了终点，数目加1
            result+=1;
            if (count<min){
                min=count;
            }
            return ;
        }else{
            for(int i=0;i<4;i++){  //尝试四个方向
                datas[x][y] = 1;   //标记这个位置走过了，因为一个位置只能走一次
                int tempi=x+move[i][0];
                int tempj=y+move[i][1];
                if((tempi<n||tempj<m||tempi>=0||tempj>=0)&&datas[x+move[i][0]][y+move[i][1]]==0||(x+move[i][0]==n&&y+move[i][1]==m)){
                    dfs(x+move[i][0],y+move[i][1],n,m,count+1);
                }
                datas[x][y] = 0;   //回溯，因为2代表可以走
            }
        }
    }

}
