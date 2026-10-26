import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    // nested loop : For
    for (int b = 0; b < 10; b++) {
        for (int k = 0; k <= b; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();

}