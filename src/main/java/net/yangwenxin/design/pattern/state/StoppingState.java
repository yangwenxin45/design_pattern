package net.yangwenxin.design.pattern.state;

public class StoppingState extends LifeState {
    @Override
    public void open() {
        super.context.setLifeState(Context.OPENNING_STATE);
        super.context.getLifeState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLifeState(Context.RUNNING_STATE);
        super.context.getLifeState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
