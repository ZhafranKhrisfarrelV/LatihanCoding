import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    //for loop
    int matkul = 5;
    double nilai, rata, total = 0;
    for (int i = 1; i <= matkul; i++) {
        System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
        nilai = sc.nextDouble();
        total += nilai;
    }
    rata = total / matkul;
    System.out.println("Rata-rata nilai : " + rata);
    sc.close();

}