import java.util.Scanner;

public class PIP05 {

    public static void main(String[] args) {
        // Zadanie 1

        System.out.println("Zadanie 1");

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj dowolną liczbę:");

        int n = input.nextInt();
        int z = 0;

        if (n > 0) {
            while (z <= n) {
                System.out.print(z + "\t");
                z++;
            }
        }

        if (n < 0) {
            while (z >= n) {
                System.out.println(z + "\t");
                z--;
            }
        }
        System.out.println(" ");

        // Zadanie 3

        System.out.println("Zadanie 3");
        System.out.println("Podaj liczbę n:");

        int n1 = input.nextInt();


        if(n1<0){
            System.out.println("n nie moze być ujemne!");
            return;
        }

        for(int x = 0; x <= n1; ++x) {
        for(int y = 0; y <= x; ++y) {
            System.out.print("* ");
            }
            System.out.println();
        }

        // Zadanie 3 dodatkowe

        System.out.println("Zadanie 3 dodatkowe");

        System.out.println("Podaj liczbę n:");
        int n2 = input.nextInt();
        int z1 = 0;


        if(n2<0){
            System.out.println("n nie moze być ujemne!");
        }

        for(int x1 = 1; x1 <= n2; ++x1, z1 = 0) {
        for(int y1 = 1; y1 <= n2 - x1; ++y1) {
                System.out.print("  ");
            }

            while (z1 != 2 * x1 - 1) {
                System.out.print("* ");
                ++z1;
            }
            System.out.println();
        }

        // Zadanie 2

        System.out.println("Zadanie 2");

        int n3 = 0;
        int n4 = 1;
        int n5, i;

        System.out.println("Do którego wyrazu ciągu chcesz obliczyć?");
        int ilosc = input.nextInt();
        int ilosc1 = ilosc + 1;

        System.out.println("Wyrazy ciągu Fibonacciego od F0 do F" + ilosc);
        System.out.print(n3 + " " + n4);

        for(i=2; i < ilosc1; ++i) {
            n5 = n3 + n4;

            System.out.print(" "+ n5);

            n3 = n4;
            n4 = n5;

        }
        

  }

}
