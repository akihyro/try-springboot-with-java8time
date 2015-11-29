package net.rakugakibox.tryspringbootwithjava8time.thymeleaf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

@Data
public class Hoge {

    private LocalDate date = LocalDate.now();

    private LocalTime time = LocalTime.now();

    private LocalDateTime dateTime = LocalDateTime.now();

}
