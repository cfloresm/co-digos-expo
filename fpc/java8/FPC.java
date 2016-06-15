import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

/**
 *
 * @author Rodrigo Ruiz Murguía <rmurguia@anzen.com.mx>
 */
public class FPC {

    //paralos tipos de regreso, revisar java.util.function
    private static DoubleBinaryOperator selecciona(String op) {

        switch (op) {
            case "-":
                return (double a, double b) -> {
                    return a - b;
                };
            case "/":
                return (a,b) -> {return a / b;};
            case "*":
                return (a,b) -> a * b;
            default:
                return (a,b) -> a + b;
        }
    }

    public static void main(String[] args) {
        Double a;
        Double b;
        String op;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Inserta el valor de a:");
            a = sc.nextDouble();
            System.out.println("Inserta el valor de b:");
            b = sc.nextDouble();
            System.out.println("Inserta la función (+ - * /): ");
            sc.nextLine();//para saltar el \n
            op = sc.nextLine();
        }

        System.out.println(selecciona(op).applyAsDouble(a, b));
    }
}
