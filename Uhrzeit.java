import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Uhrzeit {
    public static void main(String[] args) {

        ////
        LocalDate date = LocalDate.now();
        System.out.println(date); ///2022-9-10
        /////

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("d. MMM . yyyy"); ///10. sept. 2022
        System.out.println(myFormatter.format(date));

        /////


    }
}
