package net.rakugakibox.tryspringbootwithjava8time.jaxb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Hoge {

    private LocalDate isoDate = LocalDate.now();

    private LocalTime isoTime = LocalTime.now();

    private LocalDateTime isoDateTime = LocalDateTime.now();

}
