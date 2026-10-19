import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int mhs = 20, lulus = 0, tidakLulus = 0, i;
    double nilai;
    i = 1;
    while (i <= mhs) {
     System.out.print("Maasukkan nilai mahasiswa " + i + ": ");
     nilai = sc.nextDouble();
     if (nilai >= 65) {
          lulus++;
     } else {
          tidakLulus++;
     }
     i++;
    }
    System.out.println("Banyaknya mahasiswa lulus : " + lulus);
    System.out.println("Banyaknya mahasiswa tidak lulus : " + tidakLulus);
    sc.close();


   
}
    

