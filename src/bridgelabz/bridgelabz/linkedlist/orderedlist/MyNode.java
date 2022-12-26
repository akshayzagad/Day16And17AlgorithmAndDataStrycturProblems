package bridgelabz.bridgelabz.linkedlist.orderedlist;

public class MyNode<T extends Comparable<T>> {
    T data;
    MyNode<T> Next;

    public MyNode() {
    }

    public MyNode(T data) {
        this.data = data;
    }
}
