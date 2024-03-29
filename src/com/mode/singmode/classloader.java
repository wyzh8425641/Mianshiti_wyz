

//JVM的类加载机制

//package com.mode.singmode;
//
//public class classloader {
//    class Singleton{
//        private static Singleton singleton = new Singleton();
//        public static int value1;
//        public static int value2 = 0;
//
//        private Singleton(){
//            value1++;
//            value2++;
//        }
//
//        public static Singleton getInstance(){
//            return singleton;
//        }
//
//    }
//
//    class Singleton2{
//        public static int value1;
//        public static int value2 = 0;
//        private static Singleton2 singleton2 = new Singleton2();
//
//        private Singleton2(){
//            value1++;
//            value2++;
//        }
//
//        public static Singleton2 getInstance2(){
//            return singleton2;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        System.out.println("Singleton1 value1:" + singleton.value1);
//        System.out.println("Singleton1 value2:" + singleton.value2);
//
//        Singleton2 singleton2 = Singleton2.getInstance2();
//        System.out.println("Singleton2 value1:" + singleton2.value1);
//        System.out.println("Singleton2 value2:" + singleton2.value2);
//    }
//
//
//}
