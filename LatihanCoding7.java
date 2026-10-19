import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    //Infinite Loop
    int totalNilai = 0, mhs = 0, nilai;
    do {
        System.out.print("Masukkan nilai di luar rentang (0-100) untuk berhenti : ");
        nilai = sc.nextInt();
        if (nilai >= 0 && nilai <= 100) {
            totalNilai += nilai;
            mhs++;
        }
    } while (nilai >= 0 && nilai <= 100);
    if (mhs > 0) {
        double rataRata = (double) totalNilai / mhs;
        System.out.println(" Rata-rata nilai : " + rataRata);
    } else {
        System.out.println(" Tidak ada nilai yang valid dimasukkan.");
    }
    sc.close();

}