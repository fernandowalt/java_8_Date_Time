package datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
public static void main (String[] args) {

    LocalDate fechaActual = LocalDate.now();
    System.out.println(fechaActual);

    System.out.println("Dia de  la semana: " + fechaActual.getDayOfWeek());
    System.out.println("Dia semana español: " + fechaActual.getDayOfWeek()
                                                           .getDisplayName(TextStyle.FULL,
                                                                   new Locale("ES")));
    Month mes = fechaActual.getMonth();
    System.out.println("Nombre del mes : " + mes);
    System.out.println("Nombre del mes en español : " + mes.getDisplayName(TextStyle.FULL,
            new Locale("es", "ES")));
    System.out.println("numero del mes : " + mes.getValue());
    System.out.println("Dia del año: " + fechaActual.getDayOfYear());

    fechaActual = LocalDate.of(1991, 1, 11);
    System.out.println(fechaActual);

    fechaActual = LocalDate.of(1990, Month.DECEMBER, 16);
    System.out.println(fechaActual);

    fechaActual = LocalDate.parse("2021-03-15");
    System.out.println(fechaActual);

    LocalDate diaDeManiana = LocalDate.now().minusDays(15);
    System.out.println(diaDeManiana);

    LocalDate mesAnterior = LocalDate.now().withMonth(1);
    System.out.println(mesAnterior);

    LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
    System.out.println(mesAnteriorMismoDia);

    DayOfWeek diaDeLaSemana = LocalDate.now().getDayOfWeek();
    System.out.println(diaDeLaSemana);

    Month mesDelAnio = LocalDate.now().getMonth();
    System.out.println(mesDelAnio);

    int diaDelMes = LocalDate.now().getDayOfMonth();
    System.out.println(diaDelMes);

    int diaDelAnio = LocalDate.now().getDayOfYear();
    System.out.println(diaDelAnio);

    boolean esBisiesto = LocalDate.parse("2020-01-11").isLeapYear();
    System.out.println(esBisiesto);

    boolean esAnterior = LocalDate.now().isBefore(LocalDate.parse("2023-02-05"));
    System.out.println(esAnterior);

    boolean esdespues = LocalDate.now().isAfter(LocalDate.parse("2023-02-02"));
    System.out.println(esdespues);

    esdespues = LocalDate.now().minusDays(2).isAfter(LocalDate.now());
    System.out.println(esdespues);


}
}
