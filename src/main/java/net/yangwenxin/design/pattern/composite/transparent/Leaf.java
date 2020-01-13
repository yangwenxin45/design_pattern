package net.yangwenxin.design.pattern.composite.transparent;

import java.util.ArrayList;

public class Leaf extends Component {

    @Override
    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
