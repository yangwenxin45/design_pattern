package net.yangwenxin.design.pattern.chain;

public class Father implements IHandler {

    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
