package datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDayTime {
public static void main (String[] args) {

    LocalDateTime fechaLocal = LocalDateTime.now();
    /*    ZoneId madrid = ZoneId.of("Europe/Madrid");*/


/*    ZonedDateTime zonaMadrid = ZonedDateTime.of(fechaLocal, ZoneOffset.of("+02:00")).plusHours(8);
    System.out.println("zonaMadrid = " + zonaMadrid);*/

    /*    ZoneId newYork = ZoneId.of("America/New_York");*/

/*    ZonedDateTime zonaNuevaYork = zonaMadrid.withZoneSameInstant(ZoneOffset.of("-04:00"));
    System.out.println("zonaNuevaYork = " + zonaNuevaYork);

    DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm a dd MMM yyyy");

    System.out.println("detalles del viaje a españa");
    System.out.println("Partida NY: " + f.format(zonaNuevaYork));
    System.out.println("LLegada a españa: " + f.format(zonaMadrid));

    Set<String> zonas = ZoneId.getAvailableZoneIds();
    zonas.forEach(System.out::println);*/
    ZonedDateTime zonaNuevaYork = fechaLocal.atZone(ZoneId.of("America/New_York"));
    ZonedDateTime zonaMadrid = fechaLocal.atZone(ZoneId.of("Europe/Madrid"));
    System.out.println("zonaNuevaYork = " + zonaNuevaYork);
    System.out.println("zonaMadrid = " + zonaMadrid);

}
}
