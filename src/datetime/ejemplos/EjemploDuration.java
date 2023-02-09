package datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EjemploDuration {
public static void main (String[] args) {


    LocalDateTime fecha1 = LocalDateTime.now();
    LocalDateTime fecha2 = LocalDateTime.now().plusHours(5).plusMinutes(25).plusDays(2);


    Duration lapsus = Duration.between(fecha1, fecha2);
    System.out.println("lapsus = " + lapsus.toDays());
}
}
