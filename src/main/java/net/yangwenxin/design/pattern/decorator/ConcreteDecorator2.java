package net.yangwenxin.design.pattern.decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("method2修饰");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
