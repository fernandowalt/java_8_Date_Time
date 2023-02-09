package datetime.ejemplos;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
public static void main (String[] args) {


    LocalDateTime fechaYhora = LocalDateTime.now();
    System.out.println(fechaYhora);

    fechaYhora = LocalDateTime.of(2025, Month.FEBRUARY, 15, 15, 25, 45);

    System.out.println(fechaYhora);

    fechaYhora = LocalDateTime.parse("2000-05-12T15:55:15");
    System.out.println("fechaYhora = " + fechaYhora);

    fechaYhora = fechaYhora.plusYears(23).plusDays(5).plusHours(2);

    System.out.println("fechaYhora = " + fechaYhora);

    Month mes = fechaYhora.getMonth();
    int diaDeLaSemana = fechaYhora.getDayOfWeek().getValue();
    System.out.println("diaDeLaSemana = " + diaDeLaSemana);

    String formato1 = fechaYhora.format(DateTimeFormatter.ISO_DATE);
    String formato2 = fechaYhora.format(DateTimeFormatter.BASIC_ISO_DATE);
    String formato3 = fechaYhora.format(DateTimeFormatter.ISO_DATE_TIME);
    String formato4 = fechaYhora.format(DateTimeFormatter.ISO_LOCAL_TIME);
    String formato5 = fechaYhora.format(DateTimeFormatter.ISO_WEEK_DATE);

    System.out.println("formato1 = " + formato1);
    System.out.println("formato2 = " + formato2);
    System.out.println("formato3 = " + formato3);
    System.out.println("formato4 = " + formato4);
    System.out.println("formato5 = " + formato5);

    /*    si requiere de 24 horas pasar como argumento de ofPattern las HH mayusculas de lo contrario hh minusculas*/
    /*    el"a" en la cadena significa am - pm*/
    String fechaPersonalizada = fechaYhora.format(
            DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a"));
    System.out.println("fechaPersonalizada = " + fechaPersonalizada);

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a");
    String fechaConFormato = df.format(LocalDateTime.now());
    System.out.println("fechaConFormato = " + fechaConFormato);
}
}
