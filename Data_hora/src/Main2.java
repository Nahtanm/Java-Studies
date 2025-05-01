import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2025-05-01");
        LocalDateTime localDateTime = LocalDateTime.parse("2025-05-01T01:03:14");
        Instant instant = Instant.parse("2025-05-01T01:03:14Z");

        //Calculos com data e hora
        LocalDate localDate1 = localDate.minusDays(7);
        System.out.println(localDate1);

        LocalDate localDate2 = localDate.plusDays(7);
        System.out.println(localDate2);

        Instant instant1 = instant.minus(365, ChronoUnit.DAYS);
        Instant instant2 = instant.plus(7, ChronoUnit.DAYS);
        System.out.println(instant1);
        System.out.println(instant2);

        //Duracao entre datas
        Duration duration = Duration.between(instant, instant1);
        System.out.println(duration.toDays());
    }
}
