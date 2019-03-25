public class List<E> {

    public class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> prev;

        Node(Node<E> beforeNode, Node<E> afterNode, E dataOfNode) {
            this.data = dataOfNode;
            this.next = beforeNode;
            this.prev = beforeNode;
        }
    }

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

     List()
     {
         firstNode = null;
         lastNode = null;
     }
     List(E e)
     {
         firstNode = null;
         lastNode = new Node<>(null, null, e);
         firstNode = lastNode;
         ++size;
     }

     public boolean isEmpty(){
        return size == 0;
     }

    public E getFirst() throws IndexOutOfRange {
        final Node<E> newNode = firstNode;
        if (newNode == null)
            throw new IndexOutOfRange(0);
        return newNode.data;
    }


    public int size() {
        return size;
    }

    public boolean add(E e) {
        final Node<E> copyOfLast = lastNode;
        final Node<E> newNode = new Node<>(copyOfLast, null, e);
        lastNode = newNode;
        if (copyOfLast == null)
            firstNode = newNode;
        else
            copyOfLast.next = newNode;
        size++;
        return true;
    }

    Node<E> getNode(int index) {
        if (index <= (size / 2)) {
            Node<E> x = firstNode;
            for (int inner = 0; inner < index; ++inner)
                x = x.next;
            return x;
        } else {
            Node<E> x = lastNode;
            for (int inner = size - 1; inner > index; --inner)
                x = x.prev;
            return x;
        }
    }
    public E get(int index) throws IndexOutOfRange {
        if (index >= 0 && index < size) {
            return getNode(index).data;
        }
        throw new IndexOutOfRange(index);
    }
}
