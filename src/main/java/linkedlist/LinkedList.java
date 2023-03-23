package linkedlist;


public class LinkedList<T> {

    private Node<T> node;
    private boolean hasNext;

    public void add(final T aValue) {
        if (this.node == null) {
            this.node = new Node<>();
            this.node.value = aValue;
        } else {
            verifyNext(aValue, this.node);
        }
    }

    private void verifyNext(final T aValue, final Node<T> node) {
        if (node.next == null) {
            node.next = new Node<>();
            node.next.value = aValue;
            return;
        }

        verifyNext(aValue, node.next);
    }

    static class Node<T> {
        private T value;
        private Node<T> next;
    }
}
