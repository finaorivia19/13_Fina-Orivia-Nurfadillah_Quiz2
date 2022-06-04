import java.util.Scanner;

public class DoubleLinkedListsMain1 {

    public static void menu() {
        System.out.println("1. Tambah antrian:");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antri");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung Total pendapatan");
        System.out.println("6. keluar");
        System.out.println("===============")
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int nomorAntrian = 0;
        int pilih;
        String[] nama = {"Mamluatul", "Abyaz A.M", "Yoshinoya", "SusiSusanti"};
        String[] nohp  = {"08224500000", "0822451111", "0822452222", "081234456"};
        int[] kodePesanan = {1,2,3,4};
        String[] namaPesanan = {"Bulgogi", "Mie Goreng", "Nasi Rendang", "Soto Ayam"};
        int[] harga = {25000, 15000, 25000, 15000};
}