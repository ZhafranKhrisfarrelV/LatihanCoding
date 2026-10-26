void main() {
    Scanner sc = new Scanner(System.in);

    char huruf = 'a';
    for (int b = 0; b < 5; b++) {
        for (int s = 0; s < 4 - b; s++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * b + 1; k++) {
            System.out.print(huruf);
            huruf++;
            if (huruf > 'z') {
                huruf = 'a';
            }
        }
        System.out.println();
    }
    sc.close();
}