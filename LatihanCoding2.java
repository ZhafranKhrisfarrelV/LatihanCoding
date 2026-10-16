import java.util.Scanner;
public class LatihanCoding2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        int biayaSewa = 5000;
        String namaPeminjam;
        int jumlahBuku;
        int totalBiayaSebelumPotongan;
        double presentaseDiskon;
        double nilaiPotongan;
        int totalBiayaSetelahPotongan;

        System.out.print("Masukkan Nama Peminjam             : ");
        namaPeminjam = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku Yang Dipinjam : ");
        jumlahBuku = sc.nextInt();

        if (jumlahBuku < 3) {
            presentaseDiskon = 0;
        } else if (jumlahBuku >= 3 && jumlahBuku <= 5) {
            presentaseDiskon = 10;
        } else {
            presentaseDiskon = 15;
        } 

        if (jumlahBuku < 1) {
            System.out.print("Jumlah buku kurang valid");
            }


        totalBiayaSebelumPotongan = biayaSewa * jumlahBuku;
        nilaiPotongan = totalBiayaSebelumPotongan * presentaseDiskon / 100.0;
        totalBiayaSetelahPotongan = (int) totalBiayaSebelumPotongan - (int) nilaiPotongan;
        
        System.out.println("Nama Peminjam                : " + namaPeminjam);
        System.out.println("Jumlah Buku                  : " + jumlahBuku);
        System.out.println("Total Biaya Sebelum Potongan : " + totalBiayaSebelumPotongan);
        System.out.println("Presentase Diskon            : " + presentaseDiskon);
        System.out.println("Nilai Potongan               : " + (int) nilaiPotongan);
        System.out.print("Total Biaya Setelah Potongan : " + (int) totalBiayaSetelahPotongan);

        
        }

    }
}