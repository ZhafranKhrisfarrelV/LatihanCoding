import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int sewaLapanganFutsal = 120000;
    int lamaSewa;
    int jamSewa;
    int biayaLampu = 0;
    double presentaseDiskon;
    String namaPendaftar;
    double diskonMember = 0;
    double hargaSetelahDiskon;

    System.out.print("Masukkan Nama Pendaftar : ");
    namaPendaftar = sc.nextLine();
    System.out.print("Masukkan Lama Sewa      : ");
    lamaSewa = sc.nextInt();
    System.out.print("Masukkan Jam Mulai Sewa : ");
    jamSewa = sc.nextInt();

    if (lamaSewa >= 1) {

        if (jamSewa < 8) {
            System.out.println("Jam lapangan belum beroperasi (buka mulai pukul 08.00)");
        } else if (jamSewa + lamaSewa > 24) {
            System.out.println("Di luar jam operasional (lapangan tutup pukul 24.00)");
        } else {
            System.out.println("Jam lapangan sudah beroperasi");

            System.out.print("Apakah anda berstatus member? (true/false) : ");
            boolean statusMember = sc.nextBoolean();

            // 1. Diskon lama sewa
            if (lamaSewa < 3) {
                presentaseDiskon = 0;
            } else if (lamaSewa <= 5) {
                presentaseDiskon = 12;
            } else {
                presentaseDiskon = 20;
            }

            int hargaSebelumDiskon = lamaSewa * sewaLapanganFutsal;
            double potonganHarga = hargaSebelumDiskon * presentaseDiskon / 100.0;
            hargaSetelahDiskon = hargaSebelumDiskon - potonganHarga;

            // 2. Diskon member
            if (statusMember) {
                System.out.println("Anda mendapatkan diskon member sebesar 5%");
                diskonMember = hargaSetelahDiskon * 5 / 100.0;
            } else {
                System.out.println("Anda tidak mendapatkan diskon member sebesar 5%");
            }

            // 3. Biaya lampu
            if (jamSewa >= 18) {
                System.out.println("Anda mendapatkan tambahan biaya lampu sebesar Rp15.000 per jam");
                biayaLampu = lamaSewa * 15000;
            } else {
                System.out.println("Anda tidak mendapatkan tambahan biaya lampu");
            }

            double totalBiaya = hargaSetelahDiskon - diskonMember + biayaLampu;

            System.out.println("=== RINCIAN BIAYA SEWA LAPANGAN ===");
            System.out.println("Nama penyewa                    : " + namaPendaftar);
            System.out.println("Lama sewa                       : " + lamaSewa + " jam");
            System.out.println("Jam mulai                       : " + jamSewa);
            System.out.println("Harga sebelum diskon            : Rp" + hargaSebelumDiskon);
            System.out.println("Persentase diskon               : " + (int) presentaseDiskon + "%");
            System.out.println("Jumlah potongan harga           : Rp" + (int) potonganHarga);
            System.out.println("Harga setelah diskon            : Rp" + (int) hargaSetelahDiskon);
            System.out.println("Diskon member                   : Rp" + (int) diskonMember);
            System.out.println("Biaya lampu                     : Rp" + biayaLampu);
            System.out.println("Total semua biaya               : Rp" + (int) totalBiaya);
        }

    } else {
        System.out.println("Lama sewa tidak valid");
    }

    sc.close();
}