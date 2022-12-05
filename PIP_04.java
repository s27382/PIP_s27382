import java.util.Scanner;
import java.lang.Math;

public class PIP_04 {


    public static void main(String[] args) {

        System.out.println("Zadanie 4 oraz Zadanie 5");

//        // Zadanie 4 oraz Zadanie 5

        Scanner input = new Scanner(System.in);

        Double liczba1;
        Double liczba2;
        Double result;
        String operator;

        System.out.println("Jaki typ obliczeń chcesz wykonać? Wybierz z poniższej listy:");
        System.out.println("ADD -> dodawanie");
        System.out.println("SUB -> odejmowanie");
        System.out.println("DIV -> dzielenie");
        System.out.println("MUL -> mnożenie");

        operator = input.nextLine();

        System.out.println("Wprowadź pierwszą liczbę:");
        liczba1 = input.nextDouble();

        System.out.println("Wprowadź drugą liczbę:");
        liczba2 = input.nextDouble();


        switch (operator) {

            case "ADD":
                result = liczba1 + liczba2;
                System.out.println(liczba1 + " + " + liczba2 + " = " + result);
                break;

            case "add":
                result = liczba1 + liczba2;
                System.out.println(liczba1 + " + " + liczba2 + " = " + result);
                break;

            case "SUB":
                result = liczba1 - liczba2;
                System.out.println(liczba1 + " - " + liczba2 + " = " + result);
                break;

            case "sub":
                result = liczba1 - liczba2;
                System.out.println(liczba1 + " - " + liczba2 + " = " + result);
                break;

            case "DIV":
                result = liczba1 / liczba2;
                System.out.println(liczba1 + " / " + liczba2 + " = " + result);
                break;

            case "div":
                result = liczba1 / liczba2;
                System.out.println(liczba1 + " / " + liczba2 + " = " + result);
                break;

            case "MUL":
                result = liczba1 * liczba2;
                System.out.println(liczba1 + " * " + liczba2 + " = " + result);
                break;

            case "mul":
                result = liczba1 * liczba2;
                System.out.println(liczba1 + " * " + liczba2 + " = " + result);
                break;
        }

        input.close();




    }
}
