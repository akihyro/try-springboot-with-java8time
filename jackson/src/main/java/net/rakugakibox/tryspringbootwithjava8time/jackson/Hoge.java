package net.rakugakibox.tryspringbootwithjava8time.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

@Data
public class Hoge {

    private LocalDate isoDate = LocalDate.now();

    private LocalTime isoTime = LocalTime.now();

    private LocalDateTime isoDateTime = LocalDateTime.now();

    @JsonFormat(pattern = "y年M月d日")
    private LocalDate customDate = LocalDate.now();

    @JsonFormat(pattern = "H時m分s秒")
    private LocalTime customTime = LocalTime.now();

    @JsonFormat(pattern = "y年M月d日 H時m分s秒")
    private LocalDateTime customDateTime = LocalDateTime.now();

}
