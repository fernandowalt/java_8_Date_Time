package datetime.ejemplos;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularEdad {
public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Intruduce tu fecha de nacimiento con el formato año-mes-dia ejemplo: " +
            "1985-02-06");
    String fechaIngresada = scan.nextLine();

    LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada);
    LocalDate fechaActual = LocalDate.now();

    int edadActual = Period.between(fechaNacimiento, fechaActual).getYears();

    System.out.printf("Tu edad actual es %d años", edadActual);


}
}
