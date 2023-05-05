package linkedlist;


class Node_SinglyLinkedList {
    int data;
    Node_SinglyLinkedList link;

    //Constructor
    public Node_SinglyLinkedList () {
        this.data = 0;
        this.link = null;
    }
    public Node_SinglyLinkedList (int data,Node_SinglyLinkedList node) {
        this.data = data;
        this.link = node;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node_SinglyLinkedList getLink() {
        return link;
    }
    public void setLink(Node_SinglyLinkedList link) {
        this.link = link;
    }
}

//Class yang berisikan Operasi Operasi yang ada di Singly Linked List
class Operasi_SinglyLinkedList
{
    Node_SinglyLinkedList awal;
    Node_SinglyLinkedList akhir;
    int size;

    public Operasi_SinglyLinkedList() {
        this.awal = null;
        this.akhir = null;
        this.size = 0;
    }

//Method untuk cek linkedList kosong atau tidak

    public boolean isEmpty() {
        return this.awal == null;
    }

    //Method untuk mengecek size atau banyak data pada LinkedList
    public int getSize() {
        return this.size;
    }

    //Method untuk insert atau memasukkan data di AWAL
    public void insert_Awal(int x) {
        Node_SinglyLinkedList nPtr = new Node_SinglyLinkedList(x,null);
        this.size++;
        if(this.awal != null) { //sdh ada data pada linkedList
            nPtr.setLink(this.awal);
            this.awal = nPtr;
        }else {
            this.awal = nPtr;
            this.akhir = this.awal;
        }
    }

    //Method untuk insert / memasukkan data di AKHIR
    public void insert_akhir(int x) {
        Node_SinglyLinkedList nPtr = new Node_SinglyLinkedList(x,null);
        this.size++;
        if(isEmpty()) { //blm ada data
            this.awal = nPtr;
            this.akhir = this.awal;
        }
        else { //jika ada data pada linked list
            this.akhir.setLink(nPtr);
            this.akhir = nPtr;
        }
    }

    //Method untuk insert / memasukkan data di POSISI TERTENTU
    public void insert_posisi (int x , int posisi) {
        Node_SinglyLinkedList nPtr = new Node_SinglyLinkedList(x,null);
        Node_SinglyLinkedList ptr = this.awal;
        posisi = posisi - 1;
        for(int i = 1; i < this.size ; i ++) {
            if(i == posisi) {
                Node_SinglyLinkedList temp = ptr.getLink();
                ptr.setLink(nPtr);
                nPtr.setLink(temp);
            }
            ptr = ptr.getLink();
        }
        size++;
    }


    //Method untuk menampilkan data linkedList
    public void tampil_Data() {
//if yang di eksekusi ketika data kosong
        if(isEmpty()) {
            System.out.println("Tidak ada data pada LinkedList");
        }
//if yang di eksekusi ketika hanya ada satu data
        if(this.awal.getLink()== null) {
            System.out.println(this.awal.getData());
            return;
        }

//lebih dari 1 data
        Node_SinglyLinkedList ptr = this.awal;
        System.out.print(this.awal.getData() +" -> ");
        ptr = this.awal.getLink();

        while(ptr.getLink() != null) { //looping ke link berikutnya
            System.out.print(ptr.getData()+" -> ");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData());
    }

    //Method untuk menghapus data di awal
    public void delete_awal() {
        if(isEmpty()) { // tidak ada data
            System.out.println("Tidak ada data");
            return;
        }
        else { //ada data
            if(this.awal != this.akhir)
            {
                this.awal = this.awal.link;
            }
            else
            {
                this.awal = this.akhir = null;
            }
        }
    }

    //Method untuk menghapus data di akhir
    public void delete_akhir() {
        if(isEmpty())
        {
            System.out.println("Tidak ada data");
            return;
        }
        else //ada data
        {
            if(this.awal != this.akhir) //data lebih dari 1
            {
                Node_SinglyLinkedList current = awal;
//untuk mendapatkan link posisi sblm data terakhir
                while(current.link != this.akhir)
                {
                    current = current.link;
                }
                this.akhir = current;
                this.akhir.link = null;
            }
            else //hanya satu data
            {
                this.awal = this.awal = null;
            }
        }
    }

    public void delete_posisi(int posisi){
        if (posisi == 1){
            this.delete_awal();
        } else if (posisi == size){
            this.delete_akhir();
        } else {
            Node_SinglyLinkedList ptr = this.awal;
            posisi = posisi - 1;
            for (int i = 1; i < size -1; i++) {
                if (i == posisi){
                    Node_SinglyLinkedList temp = ptr.getLink();
                    temp = temp.getLink();
                    ptr.setLink(temp);
                    break;
                }
            }
        }
    }
}


public class SinglyLinkedList {

    public static void main(String[] args) {
        Operasi_SinglyLinkedList ossl = new Operasi_SinglyLinkedList();
        ossl.insert_Awal(10);
        ossl.insert_Awal(20);
        ossl.insert_Awal(30);


        ossl.insert_akhir(40);

        ossl.insert_posisi(50, 3);
        ossl.tampil_Data();
        ossl.delete_awal();
        ossl.tampil_Data();
        ossl.delete_akhir();
        ossl.tampil_Data();

    }}
