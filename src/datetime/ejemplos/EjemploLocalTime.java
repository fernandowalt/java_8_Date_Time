package datetime.ejemplos;

import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class EjemploLocalTime {
public static void main (String[] args) {

    LocalTime ahora = LocalTime.now();

    System.out.println("Hora: " + ahora.getHour());
    System.out.println("Minutos: " + ahora.getMinute());
    System.out.println("Segunfos: " + ahora.getSecond());

    LocalTime cuatroYmedia = LocalTime.of(4, 30, 0);
    System.out.println(cuatroYmedia);

    cuatroYmedia = LocalTime.parse("04:31");
    System.out.println(cuatroYmedia);

    LocalTime cuatroYcuarenta = LocalTime.of(16, 30, 25).plus(10, ChronoUnit.MINUTES);
    System.out.println(cuatroYcuarenta);

    boolean esAnterior = cuatroYcuarenta.isAfter(cuatroYmedia);
    System.out.println(esAnterior);
/*
con HH se refiere a un formato de 24 horas, con hh el formato cambia a 12 horas am-pm*/
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
    String ahoraFormateado = ahora.format(dtf);
    System.out.println(ahoraFormateado);

    String cuatroYcuarentaFormateado = cuatroYcuarenta.format(dtf);
    System.out.println(cuatroYcuarentaFormateado);


}
}
