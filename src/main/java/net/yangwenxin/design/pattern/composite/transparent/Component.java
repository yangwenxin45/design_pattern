package net.yangwenxin.design.pattern.composite.transparent;

import java.util.ArrayList;

public abstract class Component {

    public void doSomething() {
        // 编写一个业务逻辑
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();
}
