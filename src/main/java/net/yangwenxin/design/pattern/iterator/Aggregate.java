package net.yangwenxin.design.pattern.iterator;

public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator iterator();
}
