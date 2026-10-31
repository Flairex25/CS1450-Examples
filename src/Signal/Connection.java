package Signal;

import FlairList.FlairLinkedList.*;

public class Connection<T> {
    protected FlairLinkedList<Connection<T>> list;
    protected FlairNode<Connection<T>> node;
    protected SignalFunction<T> function;
    protected boolean once;
    protected boolean connected = true;
    
    @SuppressWarnings("unused")
    private Connection() {}
    public Connection(SignalFunction<T> function, FlairLinkedList<Connection<T>> list) {
        this.function = function;
        this.list = list;
        once = false;
    }

    protected void setNode(FlairNode<Connection<T>> node) {
        this.node = node;
    }

    public void disconnect() {
        if (!connected) {
            return;
        }
        connected = false;
        this.list.remove(node);
    }
}