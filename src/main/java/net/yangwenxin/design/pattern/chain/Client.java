package net.yangwenxin.design.pattern.chain;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
            if (women.getType() == 1) {
                System.out.println("\n---女儿向父亲请示---");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n---妻子向丈夫请示---");
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("\n---母亲向儿子请示---");
                son.handleMessage(women);
            } else {
                // 暂时什么也不做
            }
        }
    }
}
