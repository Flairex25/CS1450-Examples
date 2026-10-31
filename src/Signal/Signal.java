package Signal;

import FlairList.FlairLinkedList.*;

@FunctionalInterface
interface SignalFunction<T> { 
    void callback(T args);
}

public class Signal<T> {

    private FlairLinkedList<Connection<T>> connectionList = new FlairLinkedList<>();

    public void fire(T args) {
        FlairNode<Connection<T>> currentNode = connectionList.getFirstNode();
        while (currentNode != null) {
            Connection<T> connection = currentNode.getValue();
            currentNode = currentNode.getNext();
            connection.function.callback(args);
            if (connection.once == true) {
                connection.disconnect();
            }
        }
    }

    public Connection<T> connect(SignalFunction<T> signalFunction) {
        Connection<T> newConnection = new Connection<>(signalFunction, connectionList);
        newConnection.setNode(connectionList.addNode(newConnection));
        return newConnection;
    }

    public Connection<T> once(SignalFunction<T> signalFunction) {
        Connection<T> newConnection = new Connection<>(signalFunction, connectionList);
        newConnection.once = true;
        newConnection.setNode(connectionList.addNode(newConnection));
        return newConnection;
    }
}