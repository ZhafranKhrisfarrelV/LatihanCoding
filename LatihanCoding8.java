import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    // nested loop : For
    for (int b = 0; b < 10; b++) {
        for (int s = 0; s < 9 - b; s++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= b; k++) {
            System.out.print((char) (b + 'A') + " ");
        }
        System.out.println();
    }
    sc.close();

}