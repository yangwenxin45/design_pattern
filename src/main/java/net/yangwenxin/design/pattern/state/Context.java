package net.yangwenxin.design.pattern.state;

public class Context {

    public final static OpenningState OPENNING_STATE = new OpenningState();

    public final static ClosingState CLOSING_STATE = new ClosingState();

    public final static RunningState RUNNING_STATE = new RunningState();

    public final static StoppingState STOPPING_STATE = new StoppingState();

    private LifeState lifeState;

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
        this.lifeState.setContext(this);
    }

    public void open() {
        this.lifeState.open();
    }

    public void close() {
        this.lifeState.close();
    }

    public void run() {
        this.lifeState.run();
    }

    public void stop() {
        this.lifeState.stop();
    }
}
