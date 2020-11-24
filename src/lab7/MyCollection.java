package lab7;

import lab6.Flower;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//public class MyCollection<T> implements List<T> {
public class MyCollection implements List<Flower> {
    private static final int INITIAL_CAPACITY = 15;
    private Flower[] elements = new Flower[INITIAL_CAPACITY];
    private int size = 0;

    @Override
    public int size() {
        return 0;
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
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /*@Override
    public boolean add(T t) {
        return false;
    }*/

    @Override
    public boolean add(Flower o) {
//        elements <- o => index?
        if (elements.length == size) {
//            todo increase array
        }
        elements[size++] = o;
        /*elements[size] = o;
        size = size + 1;*/
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    /*@Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }*/

    @Override
    public Flower get(int index) {
        return null;
    }

    @Override
    public Flower set(int index, Flower element) {
        return null;
    }

    @Override
    public void add(int index, Flower element) {

    }

    @Override
    public Flower remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
