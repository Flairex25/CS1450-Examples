package FlairList.FlairLinkedList;

public class FlairNode<T> {
    protected FlairLinkedList<T> list;
    protected T value;
    protected FlairNode<T> previous;
    protected FlairNode<T> next;

    @SuppressWarnings("unused")
    private FlairNode() {}
    public FlairNode(T value, FlairLinkedList<T> list) { this.value = value; this.list = list; }

    public T getValue() {
        return value;
    }
    public FlairNode<T> getPrevious() {
        return previous;
    }
    public FlairNode<T> getNext() {
        return next;
    }

    public void remove() {
        boolean hasPrevious = (previous != null);
        boolean hasNext = (next != null);

        if (hasPrevious) {
            previous.next = next;
        }
        if (hasNext) {
            next.previous = previous;
        }
        next = null;
        previous = null;
    }

    public void swapNext() {
        FlairNode<T> a = this;
        FlairNode<T> b = a.next;
        FlairNode<T> left = a.previous;
        FlairNode<T> right = b.next;

        if (left != null) {
            left.next = b;
            b.previous = left;
        }

        b.next = a;
        a.previous = b;

        if (right != null) {
            a.next = right;
            right.previous = a;
        }
    }
    //L is for Larpers who vibe code together
    //A is for Anthropic!
    //R is for Radius of class circle, and
    //P is for PirateSoftware mentality
}