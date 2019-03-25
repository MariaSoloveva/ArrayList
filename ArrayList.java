public class ArrayList<E> {

    private Object[] elements;  //все элементы, которые хранит лист
    private int size = 0;  //  количество элементов, которые находятся находятся на данный момент в листе
    private int capacity = 10;   //  начальное выделенное количество памяти


    public ArrayList() {
        this.elements = new Object[capacity];
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
            capacity = initialCapacity;
        } else if (initialCapacity == 0) {
            this.elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    public Object get(int index) throws IndexOutOfRange {
        if (index >= capacity || index < 0)
            throw new IndexOutOfRange(index);
        return elements[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object o) {
        for (int inner = 0; inner < size; inner++)
            if (o.equals(elements[inner]))
                return inner;
        return -1;
    }

    public void clear() {
        for (int inner = 0; inner < size; inner++)
            elements[inner] = null;
        size = 0;
    }

    public void add(int index, E element) throws IndexOutOfRange {
        if (index + 1 < 0)
            throw new IndexOutOfRange(index);
        if (size + 1 > capacity) {
            capacity += capacity / 2;
            Object[] newElements = new Object[capacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }
}
