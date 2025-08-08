public class DoubleLinkedList<T>
{
    private static class Node<T>
    {
        private T item;
        private Node<T> next;
        private Node<T> prev;

        Node(T item)
        {
            this.item = item;
            this.next = null;
            this.prev = null;
        }
    }

    private Node<T> first, last;
    private int length;

    public DoubleLinkedList()
    {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty()
    {
        return this.length == 0;
    }

    public int size()
    {
        return this.length;
    }

    public void addInLast(T item)
    {
        Node<T> newNode = new Node<>(item);
        if (isEmpty())
            this.first = this.last = newNode;
        else
        {
            newNode.prev = this.last;
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public T removeLast()
    {
        if (isEmpty()) throw new RuntimeException("List is empty");
        T item = this.last.item;
        if (this.length == 1)
            this.clear();
        else
        {
            this.last = this.last.prev;
            this.last.next = null;
            this.length--;
        }
        return item;
    }

    public void clear()
    {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public T get(int index)
    {
        if (index < 0 || index >= this.length) throw new IndexOutOfBoundsException("Invalid index: " + index);
        Node<T> cur;
        if (index < this.length / 2)
        {
            cur = this.first;
            for (int i = 0; i < index; i++) cur = cur.next;
        } else
        {
            cur = this.last;
            for (int i = this.length - 1; i > index; i--) cur = cur.prev;
        }
        return cur.item;
    }
}