package datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {
public static void main (String[] args) throws InterruptedException {

    Instant i1 = Instant.now();

    TimeUnit.SECONDS.sleep(5);

    Duration tiempo = Duration.between(i1, Instant.now());
    System.out.println("tiempo = " + tiempo.toSeconds());


}
}
