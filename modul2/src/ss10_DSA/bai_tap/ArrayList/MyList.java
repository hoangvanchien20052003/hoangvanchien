package ss10_DSA.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public Object get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return element[i];
    }

    public int remove(int index) {
        for (int i = 0; i < element.length; i++) {
            if (index == i) {
                index = i;
            }
        }
        for (int i = index; i < element.length - 1; i++) {
            element[i] = element[i + 1];
        }
        int remove = size - 1;
        return remove;
    }

    public int size() {
        int size = element.length;
        return size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < element.length; i++) {
            if (element[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i]==o) {
                index = i;
            }
        }
        return index;
    }

    public void clear() {
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }
}