package com.saimaCode;

import java.util.Scanner;
import java.util.Stack;

public class Testnote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='<'){
                if (!stack.isEmpty()&&stack.peek()!='('){
                    stack.pop();
                }
            }
            else if (c==')'){
                stack.pop();
            }
            else {
                if (stack.isEmpty()||stack.peek()!='(')
                    stack.push(c);
                else {
                    if (c=='(')
                        stack.push(c);
                }
            }
        }
        if (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
