public class DoubleLinkedLists1 {
    Node_13 head;
    int size;

    DoubleLinkedLists(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Pembeli bel, Pesanan pes){
        if (isEmpty()) {
            head = new Node_13(null, bel, pes, null);
        } else {
            Node_13 newNode = new Node_13(null, bel, pes, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli bel, Pesanan pes){
        if (isEmpty()) {
            addFirst(bel, pes);
        } else {
            Node_13 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node_13 newNode = new Node_13(current, bel, pes, null);
            current.next = newNode;
            size++;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Node_13 tmp = head;
            while(tmp != null){
                
                tmp = tmp.next;
            }
            System.out.println("\nAntrian berhasil diisi");
        } else {
            System.out.println("Antrian sedang Kosong !");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List yang anda masukkan masih kosong, node tidak dapat dihapuskan!");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Telah melakukan Pemesanan Menu");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}