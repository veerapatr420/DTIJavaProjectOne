package com.sau.tech;

import java.net.SocketOption;


public class MyClass01 {
    public static void met1(String[] args) {
        System.out.println(111);

    }

    public static void main(String[] args) {
        System.out.println("AAAA");
        met1();
        met1();
        System.out.println("BBBB");

    }

    private static void met1() {
    }

    public static void met2(String[] args) {
        System.out.println(222);
    }
}
