package bridgelabz.bridgelabz.linkedlist;

public class UnOrderedList<K> {
    Node<K> head;
    Node<K> tail;

    public void push(K data) {
        Node<K> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.Next = head;
            head = newNode;
        }
    }

    public void Display() {
        Node<K> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.Next;
        }
        System.out.println();
    }

    public Node<K> searchNode(K key) {
        if (head == null) {
            System.out.println("linkList is null");
        } else {
            Node<K> currentNode = head;
            while (currentNode != null) {
                if (currentNode.data.equals(key)) {
                    return currentNode;
                }
                currentNode = currentNode.Next;
            }
        }
        return null;
    }

    public void searchAndDelete(K searchData) {
        Node<K> deleteNode = searchNode(searchData);
        Node<K> temp = head;
        while (temp != null) {
            if (temp == deleteNode) {
                head = deleteNode.Next;
                break;
            } else if (temp.Next == deleteNode) {
                temp.Next = deleteNode.Next;
                deleteNode.Next = null;
            }
            temp = temp.Next;
        }
    }

    public void searchAndAdd(K searchKey, K addKey) {
        Node<K> searchNode = searchNode(searchKey);//30
        Node<K> temp = searchNode.Next;
        Node<K> newNode = new Node<>(addKey);//40
        if (searchNode != null) {
            searchNode.Next = newNode;//30=>40
            newNode.Next = temp;//40=?70
        }

    }
}