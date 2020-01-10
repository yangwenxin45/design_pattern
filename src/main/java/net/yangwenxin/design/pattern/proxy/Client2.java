package net.yangwenxin.design.pattern.proxy;

public class Client2 {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finish");
    }
}
