import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    //DO-WHILE      
    int total = 0, harga, i;
    i = 1;
    do {
        System.out.print("Masukkan harga ke-" + i + ": ");
        harga = sc.nextInt();
        System.out.println("Harga ke-" + i + " sebesar " + harga);
        total += harga;
        i++; 
    } while (harga != 0);
    System.out.println("Total harga : " + total);
    sc.close();

}