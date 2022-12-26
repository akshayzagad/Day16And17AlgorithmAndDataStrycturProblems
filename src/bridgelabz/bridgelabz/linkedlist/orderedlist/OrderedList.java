package bridgelabz.bridgelabz.linkedlist.orderedlist;

public class OrderedList<T extends Comparable<T>> {
    MyNode<T> head;
    MyNode<T> tail;
    private int count;
    public int getSeize() {
        return count;
    }
    public void push(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.Next = head;
            head = newNode;
            count++;
        }
    }

    public  MyNode<T> search(T data) {
        MyNode<T> currentNode = (MyNode<T>) head;
        if (head == null) {
            System.out.println("linkList is null");
        }
        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentNode;
            }
            currentNode = currentNode.Next;
        }
        return null;
    }

    public void display() {
        MyNode<T> temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.Next;
        }
        System.out.println();
    }
    void ascendingOrderSort(int seize) {
       MyNode<T> current=head;
        MyNode<T> index=null;
        T temp;
        if (head==null){
            return;
        }
        else {
            while (current!=null){
                index=current.Next;
                while (index!=null){
                    if (current.data.compareTo(index.data)>0){
                        temp=current.data;
                        current.data= index.data;
                        index.data=temp;
                    }
                    index=index.Next;
                }
                current=current.Next;
            }
        }
    }

}
