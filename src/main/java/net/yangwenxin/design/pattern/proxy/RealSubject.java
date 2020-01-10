package net.yangwenxin.design.pattern.proxy;

public class RealSubject implements Subject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
