package net.yangwenxin.design.pattern.state;

public class OpenningState extends LifeState {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        super.context.setLifeState(Context.CLOSING_STATE);
        super.context.getLifeState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
