package net.yangwenxin.design.pattern.state;

public class RunningState extends LifeState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }

    @Override
    public void stop() {
        super.context.setLifeState(Context.STOPPING_STATE);
        super.context.getLifeState().stop();
    }
}
