public class Node_13 {
    Pembeli pembeli;
    Pesanan pesanan;

    Node_13 prev, next;

    Node_13(Node_13 prev, Pembeli pembeli, Pesanan pesanan, Node_13 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }
}