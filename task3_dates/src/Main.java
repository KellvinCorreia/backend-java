import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDateTime dataEHora = LocalDateTime.now();
        System.out.println(dataEHora);
        System.out.println(dataAtual);
    }
}