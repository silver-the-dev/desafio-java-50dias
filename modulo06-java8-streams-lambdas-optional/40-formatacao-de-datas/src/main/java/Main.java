import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String date = localDateTime.format(dateTimeFormatter);
        System.out.println(date);
    }
}
