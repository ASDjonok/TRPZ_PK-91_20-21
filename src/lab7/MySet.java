package lab7;

import lab6.Flower;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Flower> {

    private Node head;
    private int size = 0;

    //    todo think about static
    class Node {
        private Flower flower;

        private Node next;

        public Node(Flower flower) {
            this.flower = flower;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Flower> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Flower flower) {
        Node node = new Node(flower);
        node.setNext(head);
        head = node;
        size++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Flower> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
