import java.util.Scanner;

void main() {
        Scanner input = new Scanner(System.in);

        int jumlahProduk, jumlahHari;
        int p, d;
        int terjual;
        int totalProduk, totalSemua;
        double rata;

        // Validasi: jumlah produk dan jumlah hari minimal 1
        do {
            System.out.print("Masukkan jumlah produk : ");
            jumlahProduk = input.nextInt();
            System.out.print("Masukkan jumlah hari   : ");
            jumlahHari = input.nextInt();

            if (jumlahProduk < 1 || jumlahHari < 1) {
                System.out.println("Jumlah produk dan jumlah hari minimal 1! Ulangi input.\n");
            }
        } while (jumlahProduk < 1 || jumlahHari < 1);

        totalSemua = 0;
        p = 1;

        // OUTER LOOP (while): per produk
        while (p <= jumlahProduk) {
            totalProduk = 0;
            System.out.println("\n=== Produk ke-" + p + " ===");

            // INNER LOOP (for): per hari
            for (d = 1; d <= jumlahHari; d++) {

                // DO-WHILE: ulangi input hari tersebut jika negatif
                do {
                    System.out.print("Jumlah terjual hari ke-" + d + " : ");
                    terjual = input.nextInt();

                    if (terjual < 0) {
                        System.out.println("Jumlah terjual tidak boleh negatif! Ulangi input.");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            rata = (double) totalProduk / jumlahHari;
            System.out.println("Total penjualan produk ke-" + p + "         : " + totalProduk);
            System.out.println("Rata-rata harian produk ke-" + p + "        : " + rata);

            totalSemua += totalProduk;
            p++;
        }

        System.out.println("\nTotal seluruh produk : " + totalSemua);

        input.close();
    }
