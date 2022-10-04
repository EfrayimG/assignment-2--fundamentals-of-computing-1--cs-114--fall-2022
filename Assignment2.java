import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner numberFinder = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNumber = numberFinder.nextByte();
        int i,j,k;

        for (i = userNumber / 2; i >= -userNumber / 2; i--) {
            for (k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (userNumber - i * 2) && i >= 0; j++) {
                System.out.print("*");
            }
            for (k = 1; k <= -i && i < 0; k++) {
                System.out.print(" ");
            }
            for (j = (userNumber / 2) * 2 + 2 * i; j >= -(userNumber % 2 - 1) && i < 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
