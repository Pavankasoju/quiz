package com.capgemini.quiz.day6;

public class Question7 {
    public static void main(String arg[]) {
        System.out.println("---------------");
        I a = new I();
        System.out.println("---------------");
        O b = new O();
        System.out.println("---------------");
    }
}
class I {
    I() {
        System.out.println("Created A");
    }
}
class O extends I {
    O() {
        System.out.println("Created B");
    }
}
