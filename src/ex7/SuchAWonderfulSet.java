import java.util.*;

// https://habr.com/ru/company/sberbank/blog/416413/ , https://habr.com/en/post/127864/

public class SuchAWonderfulSet<T> implements Set<T> {

    static class Node<T> {

        public Node<T> next;
        public Node<T> prev;
        public T value;

        public Node(Node<T> next, Node<T> prev, T value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }

    static class MyFavouriteIterator<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    private int size = 0;
    private Node<T> header = null;

    public SuchAWonderfulSet() {
    }

    public SuchAWonderfulSet(T t) {
        add(t);
    }

    public SuchAWonderfulSet(Collection<? extends T> c) {
        addAll(c);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null)
            return false;
        Node<T> node = header;

        for (int i = 1; i <= size; i++) {
            node = node.next;
            if (o.equals(node.value))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyFavouriteIterator<T>();
    }

    @Override
    public Object[] toArray() {
        if (isEmpty())
            return new Object[0];
        Node<T> node = header;
        Object[] array = new Object[size];
        for (int i = 1; i <= size; i++) {
            node = node.next;
            array[i - 1] = node.value;
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < size)
            a = (T1[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);

        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            a[i] = (T1) node.value;
            node = node.next;
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        if (contains(t))
            return false;
        Node<T> node = new Node<>(null, null, t);
        if (header != null) {
            header.prev.next = node;
            node.prev = header.prev;
            node.next = header;
            header.prev = node;
        } else {
            header = node.prev = node.next = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null)
            return false;
        Node<T> node = header;

        for (int i = 1; i <= size; i++) {
            node = node.next;
            if (o.equals(node.value)) {
                node.prev.next = node.next;
                node.prev.prev = node.prev;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!(contains(o)))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T t : c) {
            add(t);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        /* Node<T> node = header;
        T tmpValue;
        for (Object o : c) {
            for (int i = 0; i <= size(); i++) {
                System.out.println("1 = " + o + "\n2 = " + node.value);
                if (node.value != o) {
                    tmpValue = node.value;
                    node = node.next;
                    remove(tmpValue);
                } else {
                    node = header;
                    break;
                }
            }
        }*/
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object o : c) {
            remove(o);
        }
        return true;
    }

    @Override
    public void clear() {
        for (Node<T> x = header; x != null; ) {
            Node<T> next = x.next;
            x.value = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        header = null;
        size = 0;
    }

    public String toString() {
        Node<T> node = header;
        StringBuilder res = new StringBuilder();

        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append("{").append(node.value.toString()).append("}");
            if (i != size - 1) {
                res.append(", ");
            }
            node = node.next;
        }
        res.append("]");
        return res.toString();
    }
}
