package net.yangwenxin.design.pattern.decorator;

public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
