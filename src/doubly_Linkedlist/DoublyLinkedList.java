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
    public void insert_akhir(int x){
        Node ptr = new Node(x,null,null);
        if (isEmpty()){
            awal = ptr;
            akhir = awal;
        } else {
            ptr.setPrev(akhir);
            akhir.setNext(ptr);
            akhir = ptr;
        }
        size++;
    }
    public void insert_posisi(int x, int posisi){
        Node nptr = new Node(x,null,null);
        if (posisi == 1){
            this.insert_awal(x);
        } else if (posisi == size) {
            this.insert_akhir(x);
        } else {
            Node ptr = awal;
            for (int i = 2; i <= size; i++) {
                if (i == posisi){
                    Node temp = ptr.getNext();
                    ptr.setNext(nptr);
                    nptr.setPrev(ptr);
                    nptr.setNext(temp);
                    temp.setPrev(nptr);
                }
                ptr = ptr.getNext();
            }
            size++;
        }
    }
    public void tampil(){
        if (isEmpty()){
            System.out.println("data tidak ada");
        } else if (awal.getNext() == null){
            System.out.println(awal.getData());
        } else {
            Node ptr = awal;
            System.out.print(awal.getData() + "<->");
            ptr = awal.getNext();
            while (ptr.getNext() != null){
                System.out.print(ptr.getData() + "<->");
                ptr = ptr.getNext();
            }
            System.out.println(ptr.getData());
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Operasi dll = new Operasi();
        dll.insert_awal(10);
        dll.insert_awal(10);
        dll.tampil();
        dll.insert_awal(30);
        dll.tampil();
        dll.insert_akhir(30);
        dll.tampil();
        dll.insert_akhir(50);
        dll.tampil();
    }
}
