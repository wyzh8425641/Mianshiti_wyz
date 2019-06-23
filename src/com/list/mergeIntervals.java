package com.list;

import java.util.*;

public class mergeIntervals {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int [][] interval=new int[4][2];
        for (int i=0;i<4;i++){
            for (int j=0;j<2;j++){
                interval[i][j]=in.nextInt();
            }
        }
        for (int i=0;i<mergeIntervals(interval).length;i++){
            for (int j=0;j<mergeIntervals(interval)[0].length;j++){
                System.out.println(mergeIntervals(interval)[i][j]);
            }
        }
    }
    public static int[][] mergeIntervals(int[][] intervals) {
        int M = 0, N = 0;
        if ((M = intervals.length) == 0 || (N = intervals[0].length) == 0) return new int[0][0];

        Arrays.sort(intervals, (row1, row2) -> (row1[0] - row2[0]));

        Stack<int[]> stack = new Stack<>();//新建一个栈

        for(int i = 0; i < M; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (stack.isEmpty()) {
                stack.push(intervals[i]);//栈为空往里面填入一个集合
            }else {
                int[] last = stack.peek();//从栈中取出第一个
                if (start <= last[1]) {//如果下一个区间的开始小于上一个区间的最后，则进行合并
                    stack.pop();//将上一个区间出栈
                    stack.push(new int[]{Math.min(last[0], start), Math.max(last[1], end)});//将两个区间合并之后进栈
                }else {
                    stack.push(intervals[i]);//两个区间没有交集则进行入栈
                }
            }
        }

        int i = 0;
        int[][] res = new int[stack.size()][2];

        while (!stack.isEmpty())
            res[i++] = stack.pop();

        return res;
    }
//    public class Interval{
//        int start;
//        int end;
//        Interval(){start=0;end=0;}
//        Interval(int s,int e){start=s;end=e;}
//    }
//    public class MyComparator implements Comparator<Interval> {
//        @Override
//        public int compare(Interval a,Interval b){
//            return a.start-b.start;
//        }
//    }
//    public List<Interval> merge(List<Interval> intervals) {
//        List<Interval> ans = new ArrayList<Interval>();
//        if (intervals.size() == 0) return ans;
//
//        Collections.sort(intervals, new MyComparator());
//
//        int start = intervals.get(0).start;
//        int end = intervals.get(0).end;
//
//        for (int i = 0; i < intervals.size(); i++) {
//            Interval inter = intervals.get(i);
//            if (inter.start > end) {
//                ans.add(new Interval(start, end));
//                start = inter.start;
//                end = inter.end;
//            } else {
//                end = Math.max(end, inter.end);
//            }
//        }
//        ans.add(new Interval(start, end));
//
//        return ans;
//    }
}
