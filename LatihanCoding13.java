import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int totalSemua = 0;
    for (int h = 1; h <= 4; h++) {
        int totalPerHari = 0;
        System.out.println("Hari ke-" + h);

        for (int p = 1; p <= 3; p++) {
            System.out.print("Masukkan jumlah produk " + p + " : ");
            int jumlahProduk = sc.nextInt();
            totalPerHari += jumlahProduk;
        }
        System.out.println("Total produk hari ke-" + h + " = " + totalPerHari);
        totalSemua += totalPerHari;
    }
    System.out.println("Total semua produk : " + totalSemua);
    sc.close();
}