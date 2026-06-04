package com.company.java.java8.defaultmethod;

interface I{
    public void m1();
    public void m2();
    public void m3();
}
class test implements I {
    public void m1() {
    }

    public void m2() {
    }
    public void m3(){

    }
/*class test1 implements I{
    public void m1(){}
    public void m2(){}
}
class test100 implements I {
    public void m1() {}
    public void m2() {}
}*/

    public static void main(String[] args) {
        test t = new test();
        t.m1();
        t.m2();
        t.m3();
    }
}