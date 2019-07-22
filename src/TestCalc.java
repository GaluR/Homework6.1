import java.util.Scanner;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą wartość: ");
        calc.a = scan.nextDouble();
        System.out.println("Podaj drugą wartość: ");
        calc.b= scan.nextDouble();
        scan.close();
        System.out.println(calc.check());
    }
}
