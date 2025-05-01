import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Data atual sem horario | Data-hora Local
        LocalDate localDate1 = LocalDate.now();
        System.out.println("Data atual sem horario: " + localDate1);

        //Data atual com horario | Data-hora Local
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data atual com horario: " + localDateTime);

        //Data atual com horario e fuso horario | Data-hora Global
        Instant instant = Instant.now();
        System.out.println("Data atual com horario e fuso horario: " +instant);

        //Converte um texto para data
        LocalDate localDate2 = LocalDate.parse("2026-04-30");
        System.out.println("Pegando texto e transformando em data: " + localDate2);

        LocalDateTime localDateTime2 = LocalDateTime.parse("2026-04-30T16:30:11");
        System.out.println("Pegando texto e transformando em data e horario: " + localDateTime2);

        Instant instant1 = Instant.parse("2024-04-30T16:35:14Z");
        System.out.println("Pegando texto e transformando em data, horario e fuso horario: " + instant1);

        //Formatar uma data
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate3 = LocalDate.parse("30/05/2025",formatter1);
        System.out.println("Data formatada 1: " + localDate3);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDate4 = LocalDateTime.parse("30/05/2025 16:50",formatter2);
        System.out.println("Data formatada 2: " + localDate4);

        //Pegando data por ano, mes e dia separadamente
        LocalDate localDate5 = LocalDate.of(2025, 04, 30);
        System.out.println("Pegando cada var da data separadamente: " + localDate5);

        LocalDateTime localDate6 = LocalDateTime.of(2026, 04, 30, 16,55);
        System.out.println("Pegando cada var da data, horario e fuso horario separadamente: " + localDate6);

        //Convertendo data para texto
        LocalDate localDate7 = LocalDate.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate7.format(formatter3));
        System.out.println(formatter3.format(localDate7));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDateTime localDateTime3 = LocalDateTime.now();
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.println(localDateTime3.format(formatter4));
        System.out.println(formatter4.format(localDateTime3));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        Instant instant2 = Instant.now();
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ssz").withZone(ZoneId.systemDefault());//WithZone(ZoneId.systemDefault()) pega o fuso do sistema
        System.out.println(formatter5.format(instant2));

        //Converter dt global para dt local

        /*(for(String x : ZoneId.getAvailableZoneIds()){//imprime um lista de fuso horario de diferentes locais
            System.out.println(x);
        }*/

        LocalDate localDate = LocalDate.parse("2025-05-01");
        LocalDateTime localDateTime1 = LocalDateTime.parse("2025-05-01T00:30:20");
        Instant instant3 = Instant.parse("2025-05-01T00:30:20Z");

        LocalDate localDate8 = LocalDate.ofInstant(instant3,ZoneId.systemDefault());
        System.out.println(localDate8);

        LocalDate localDate9 = LocalDate.ofInstant(Instant.parse("2025-05-03T00:30:20Z"), ZoneId.of("Portugal"));
        System.out.println(localDate9);

        //Obter dados de uma data local
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());


    }
}