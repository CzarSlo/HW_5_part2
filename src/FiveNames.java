import java.util.Scanner;

public class FiveNames {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj 5 imion:");

        for (int a = 0; a < names.length; a++) {
            names[a] = input.nextLine();
        }
        System.out.println();

        for (int a = 4; a > -1; a--) {
            System.out.println("Cześć " + names[a]);

        }
    }
}



