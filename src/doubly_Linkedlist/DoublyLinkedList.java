package doubly_Linkedlist;

class Node{
    int data;
    Node prev;
    Node next;
    public Node(){
        data = 0;
        prev = null;
        next = null;
    }
    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class Operasi{
    Node awal, akhir;
    int size;
    public Operasi(){
        awal = null;
        akhir = null;
        size = 0;
    }
    public boolean isEmpty(){
        return awal == null;
    }
    public int getSize(){
        return size;
    }
    public void insert_awal(int x){
        Node ptr = new Node(x, null, null);
        if (isEmpty()){
            awal = ptr;
            akhir = awal;
        } else {
            awal.setPrev(ptr);
            ptr.setNext(awal);
            awal = ptr;
        }
        size++;
    }
    public void tampil(){
        if (isEmpty()){
            System.out.println("data tidak ada");
        } else if (awal.getNext() == null){
            System.out.println(awal.getData());
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {

    }
}
