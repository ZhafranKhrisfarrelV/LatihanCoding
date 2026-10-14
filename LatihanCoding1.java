import java.util.Scanner;

public class LatihanCoding1 {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String nama;
            int hargaSewaPerJam = 75000;
            int hargaDrum = 20000;
            int hargaMikrofon = 10000;
            int lamaSewa;
            int hargaSebelumDiskon;
            double persenDiskon;
            double diskonLamaSewa;
            char member;
            int layananTambahan;
            double diskonMember;
            double hargaSetelahDiskon;
            int biayaLayananTambahan = 0;
            double totalBiayaSewa;


            System.out.print("Masukkan nama penyewa : ");
            nama = sc.nextLine();
            System.out.print("Masukkan lama sewa (jam) : ");
            lamaSewa = sc.nextInt();    
            System.out.println("Masukkan member (Y/N) : ");
            member = sc.next().toLowerCase().charAt(0);
            System.out.println("Masukkan layanan tambahan (0-3) : ");
            layananTambahan = sc.nextInt();

            if (lamaSewa < 1 || lamaSewa > 12) {
            System.out.println("Lama sewa tidak valid");
            return;
            }

            if (layananTambahan < 0 || layananTambahan > 3) {
            System.out.println("Pilihan layanan tidak valid");
            return;
            }

            hargaSebelumDiskon = lamaSewa * hargaSewaPerJam;

            if (lamaSewa < 3) {
            persenDiskon = 0;
            } else if (lamaSewa <= 5) {
            persenDiskon = 10;
            } else {
            persenDiskon = 20;
            }

            diskonLamaSewa = hargaSebelumDiskon * persenDiskon / 100.0;
            hargaSetelahDiskon = hargaSebelumDiskon - diskonLamaSewa;

            if (member == 'y') {
            diskonMember = hargaSetelahDiskon * 5 / 100.0;

            
            switch (layananTambahan) {
            case 1:
                biayaLayananTambahan = hargaDrum;
                break;
            case 2:
                biayaLayananTambahan = hargaMikrofon;
                break;
            case 3:
                biayaLayananTambahan = hargaDrum + hargaMikrofon;
                break;
            default:
                biayaLayananTambahan = 0;
            }

            totalBiayaSewa = hargaSetelahDiskon - diskonMember + biayaLayananTambahan;

        // Output
            System.out.println("\n===== STRUK PENYEWAAN STUDIO =====");
            System.out.println("Nama                 : " + nama);
            System.out.println("Lama sewa            : " + lamaSewa + " jam");
            System.out.println("Status member        : " + (member == 'y' ? "Member" : "Bukan member"));
            System.out.println("Harga sebelum diskon : Rp" + hargaSebelumDiskon);
            System.out.println("Diskon lama sewa     : " + persenDiskon + "% (Rp" + (int) diskonLamaSewa + ")");
            System.out.println("Diskon member        : Rp" + (int) diskonMember);
            System.out.println("Biaya layanan        : Rp" + biayaLayananTambahan);
            System.out.println("Total bayar          : Rp" + (int) totalBiayaSewa);

            }

        }
          
    } 
                
}      