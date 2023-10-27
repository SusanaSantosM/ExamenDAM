import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        Clase ob = new Clase();

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce num1: ");
        System.out.println("Introduce num2: ");
        ob.verClase(sc.nextShort(), sc.nextShort());
    }
}