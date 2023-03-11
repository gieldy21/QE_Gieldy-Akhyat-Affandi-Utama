package basicprogramming;

public class Segitiga {

    public static void printAsterisk(int n) {
        for (int i = 1; i <= n; i++) {

            // loop to print the number of spaces before the star
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for new line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAsterisk(5);
    }
}