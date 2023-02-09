package datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
public static void main (String[] args) {

    LocalDate fecha1 = LocalDate.of(2011, 9, 23);
    LocalDate fecha2 = LocalDate.of(2020, 11, 25);
    fecha2 = fecha2.withMonth(3);

    Period p = Period.between(fecha1, fecha2);
    System.out.println("p = " + p);

    System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias", fecha1, fecha2,
            p.getYears(), p.getMonths(), p.getDays());


}
}
