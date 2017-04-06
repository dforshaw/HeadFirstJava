package com.headfirstjava.ch7;

class A {
    int ivar = 7;
    void m1() {
        System.out.print("A's m1, ");
    }

    void m2() {
        System.out.print("A's m2, ");
    }

    void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends A {
    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends B {
    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }
}


public class MixedMessages {

    public static void main(String[] args) {

        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
        System.out.println();
        test4();
    }

    public static void test1() {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1();
        c.m2();
        a.m3();
    }

    public static void test2() {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        c.m1();
        c.m2();
        c.m3();
    }

    public static void test3() {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        a.m1();
        b.m2();
        c.m3();
    }

    public static void test4() {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        a2.m1();
        a2.m2();
        a2.m3();
    }

}