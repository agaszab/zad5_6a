import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int x = scan.nextInt();


        while (((x < 100) && (x % 3 != 0)) || ((x > 200) && (x % 3 != 0))) {


            if (x < 100) {
                System.out.println("Podana liczba jest za mała.");
            }
            if (x > 200) {
                System.out.println("Podana liczba jest za duża.");
            }

            if (x % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3.");

            }
            System.out.println("Podaj liczbę:");
            x = scan.nextInt();
        }

        System.out.println("Podana liczba jest ok.");
    }
}
