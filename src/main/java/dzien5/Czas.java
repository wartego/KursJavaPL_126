package dzien5;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Czas {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Now is the time: " + localTime);    // Now is the time: 22:34:27.106


        LocalTime localTime1 = LocalTime.now()
                .withSecond(0)                                  // ustawiamy sekundy na wartość 0
                .withNano(0);                                   // ustawiamy nanosekundy na wartość 0
        System.out.println("Now is the time: " + localTime1);    // Now is the time: 22:41

        LocalTime now = LocalTime.now();
        System.out.println("Now is the time: " + now);          // Now is the time: 22:49:01.241

        now = now
                .plusMinutes(10)
                .plusHours(1)
                .plusSeconds(25);
        System.out.println("Now is the changed time: " + now);  // Now is the changed time: 23:59:01.241


        LocalTime nowForString = LocalTime.now();
        String formattedTime = nowForString.getHour() + ":" + nowForString.getMinute() + ":" + nowForString.getSecond();
        System.out.println(formattedTime);  // 22:55:26



        /// Data
        LocalDate localDate = LocalDate.of(2020, Month.MARCH, 28);
        System.out.println("Data : " + localDate);  // 2020-03-28

        //
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //


        System.out.println(Duration.ofHours(10).toMinutes());   // 10 godzin wyrażona w minutach: 600
// W przykładzie poniżej została wyliczona różnica czasu w minutach pomiędzy czasem obecnym a czasem o 2 dni póżniejszym
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes()); // 2880
// Poniżej została wyliczona liczba miesięcy pomiędzy dwoma datami
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(100)).getMonths());         // 3

        //


        LocalTime localTimeFormatr = LocalTime.now();
        String formattedLocalTime = localTimeFormatr.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime); // 21:11:00.024

    }
}
