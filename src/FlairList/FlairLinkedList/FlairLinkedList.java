package FlairList.FlairLinkedList;

import FlairList.FlairList;

public class FlairLinkedList<T> extends FlairList<T> {

    @FunctionalInterface 
    interface forEachNode<T> {
        void callback(int i, FlairNode<T> node);
    }

    private FlairNode<T> head;
    private FlairNode<T> tail; 

    public FlairNode<T> addNode(int index, T value) {
        FlairNode<T> newNode = new FlairNode<>(value, this);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return newNode;
        }
        if (index < 0 || index > size) {
            outOfBoundsException(index);
        }
        if (index == 0) {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            size++;
            return newNode;
        }
        if (index == size) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            size++;
            return newNode;
        }
        //Insert node somewhere in middle or something like that
        //Hopefully anthropic doesn't come after me for cracking
        //the code to their proprietary data structure...
        FlairNode<T> node = getNode(index);
        newNode.previous = node.previous;
        newNode.next = node;
        node.previous.next = newNode;
        node.previous = newNode;
        size++;
        return newNode;
    }
    public FlairNode<T> addNode(T value) {
        return addNode(size, value);
    }
    public void add(int index, T value) {
        addNode(index, value);
    }
    public void add(T value) {
        addNode(value);
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public T remove(int index) {
        FlairNode<T> node = getNode(index);
        T value = node.value;
        node.remove();
        size--;
        return value;
    }

    public T remove(FlairNode<T> node) {
        T value = node.value;
        if (node.list == this) {
            node.remove();
            size--;
        }
        return value;
    }

    public FlairNode<T> getNode(int index) {
        if (index < 0 || index >= size) {
            outOfBoundsException(index);
        }
        if (index == 0) {
            return head;
        }
        if (index == size-1) {
            return tail;
        }
        FlairNode<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public FlairNode<T> getFirstNode() {
        return head;
    }

    public FlairNode<T> getLastNode() {
        return tail;
    }

    public void forEachNode(forEachNode<T> forEachFunc) {
        if (size == 0) {
            return;
        }
        FlairNode<T> currentNode = head;
        for (int i = 0; i < size; i++) {
            forEachFunc.callback(i, currentNode);
            currentNode = currentNode.next;
        }
    }

    public void forEach(FLIterableForEach<T> forEachFunc) {
        if (size == 0) {
            return;
        }
        FlairNode<T> currentNode = head;
        for (int i = 0; i < size; i++) {
            forEachFunc.callback(i, currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public void sort(FLIterableCompare<T> compareFunc) {
        for (int i = 0; i < size; i++) {
            FlairNode<T> node = head;
            for (int v = 0; v < size-1; v++) {
                if(compareFunc.callback(node.value, node.next.value)) {
                    node.swapNext();
                }
                else {
                    node = node.next;
                }
            }
        }
    }
}