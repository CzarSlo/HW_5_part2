import java.util.Scanner;

public class TwoDimen {
    public static void main(String[] args) {
        int[][] dwa = new int[3][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Wczytaj 9 liczb: ");

        dwa[0][0] = input.nextInt();
        dwa[0][1] = input.nextInt();
        dwa[0][2] = input.nextInt();

        dwa[1][0] = input.nextInt();
        dwa[1][1] = input.nextInt();
        dwa[1][2] = input.nextInt();

        dwa[2][0] = input.nextInt();
        dwa[2][1] = input.nextInt();
        dwa[2][2] = input.nextInt();

        System.out.println();
        System.out.println(dwa[0][0] + " " + dwa[0][1] + " " + dwa[0][2]);
        System.out.println(dwa[1][0] + " " + dwa[1][1] + " " + dwa[1][2]);
        System.out.println(dwa[2][0] + " " + dwa[2][1] + " " + dwa[2][2]);


        int sum1 = dwa[0][0] + dwa[0][1] + dwa[0][2];
        int sum2 = dwa[1][0] + dwa[1][1] + dwa[1][2];
        int sum3 = dwa[2][0] + dwa[2][1] + dwa[2][2];
        System.out.println();

        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println("Największa suma liczb jest w wierszu 1. i wynosi " + sum1);
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println("Największa suma liczb jest w wierszu 2. i wynosi " + sum2);
        } else if (sum3 > sum1 && sum3 > sum2) {
            System.out.println("Największa suma liczb jest w wierszu 3. i wynosi " + sum3);
        }
    }
}
