import java.util.Random;
import java.util.Scanner;

public class PIP_04 {


    public static void main(String[] args) {

        System.out.println("Zadanie 4 oraz Zadanie 5");

//        // Zadanie 4 oraz Zadanie 5

        Scanner input = new Scanner(System.in);

        int liczba1;
        int liczba2;
        int result;
        String operator;

        System.out.println("Wprowadź pierwszą liczbę:");
        liczba1 = Math.abs(Integer.parseInt(input.nextLine()));

        System.out.println("Wprowadź drugą liczbę:");
        liczba2 = Math.abs(Integer.parseInt(input.nextLine()));


        System.out.println("Jaki typ obliczeń chcesz wykonać? Wybierz z poniższej listy:");
        System.out.println("ADD -> dodawanie");
        System.out.println("SUB -> odejmowanie");
        System.out.println("DIV -> dzielenie");
        System.out.println("MUL -> mnożenie");

        operator = input.nextLine();


        switch (operator) {

            case "ADD":
                result = liczba1 + liczba2;
                System.out.println(liczba1 + " + " + liczba2 + " = " + result);
                break;


            case "SUB":
                result = liczba1 - liczba2;
                System.out.println(liczba1 + " - " + liczba2 + " = " + result);
                break;


            case "DIV":
                result = liczba1 / liczba2;
                System.out.println(liczba1 + " / " + liczba2 + " = " + result);
                break;


            case "MUL":
                result = liczba1 * liczba2;
                System.out.println(liczba1 + " * " + liczba2 + " = " + result);
                break;


            default:
                System.out.println("Niepoprawnie wybrana operacja!");
                return;

        }


        // Zadanie 1

        System.out.println("Zadanie 1");

        boolean czyPada = false;
        boolean czySwieciSlonce = true;

        if(czyPada == true && czySwieciSlonce == false)
            System.out.println("plucha");

        else if(czyPada == true && czySwieciSlonce == true)
            System.out.println("tęcza");

        else if(czyPada == false && czySwieciSlonce == true)
            System.out.println("słonecznie");

        else if(czyPada == false && czySwieciSlonce == false)
            System.out.println("pochmurno");


//        // Zadanie 8

        System.out.println("Zadanie 8");

        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walutę");
        System.out.println("1 - PLN");
        System.out.println("2 - JPY");

        int opcjaWaluty = input.nextInt();

        System.out.println("Wprowadz kwote:");
        double kwota = input.nextDouble();
        double jpyToPln = 0.0033;
        double plnToJpy = 30.42;

        double przewalutowanie;

        if(opcjaWaluty == 1){
            System.out.println("Wybrałeś opcje zamiany z PLN na JPY");

            przewalutowanie = kwota * plnToJpy;
            System.out.println(kwota + " zł => " + przewalutowanie + " ¥ " );
        }

        else if(opcjaWaluty == 2){
            System.out.println("Wybrałeś opcje zmiany z JPY na PLN");

            przewalutowanie = kwota * jpyToPln;
            System.out.println(kwota + " ¥ => " + przewalutowanie + " zł ");


        }

        // Zadanie 6

        System.out.println("Zadanie 6");

        System.out.println("Wprowadź dwie liczby rzeczywiste i naciśnij ENTER po każdej z nich:");

        double a = input.nextDouble();
        double b = input.nextDouble();

        if(a > b) {
            double c = a;
            a = b;
            b = c;
        }
        System.out.println("Wybrany przedział: [" + a + ";" + b + "]");

        Random losowe = new Random();

        double d1 = losowe.nextDouble(a, b);
        double d2 = losowe.nextDouble(a, b);
        double d3 = losowe.nextDouble(a, b);

        System.out.println("Wartości generowane losowo:");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        if(d1 > d2){
            double temp = d1;
            d1 = d2;
            d2 = temp;
        }
        if(d2 > d3){
            double temp = d2;
            d2 = d3;
            d3 = temp;
        }
        if(d1 > d2){
            double temp = d1;
            d1 = d2;
            d2 = temp;
        }

        System.out.println("Gdzie: " + d1 + " < " + d2 + " < " + d3);







    }

}
