import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    // nested loop : For
    for (int b = 0; b < 4; b++) {
        for (int k = 0; k < 4; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();

}