package net.rakugakibox.tryspringbootwithjava8time.properties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class PropertiesLoggingRunner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Value("${try-springboot-with-java8time.iso.date}")
    private LocalDate isoDate;

    @Value("${try-springboot-with-java8time.iso.time}")
    private LocalTime isoTime;

    @Value("${try-springboot-with-java8time.iso.date-time}")
    private LocalDateTime isoDateTime;

    @Value("${try-springboot-with-java8time.custom.date}")
    @DateTimeFormat(pattern = "y年M月d日")
    private LocalDate customDate;

    @Value("${try-springboot-with-java8time.custom.time}")
    @DateTimeFormat(pattern = "H時m分s秒")
    private LocalTime customTime;

    @Value("${try-springboot-with-java8time.custom.date-time}")
    @DateTimeFormat(pattern = "y年M月d日 H時m分s秒")
    private LocalDateTime customDateTime;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("iso.date: {}", isoDate);
        log.info("iso.time: {}", isoTime);
        log.info("iso.date-time: {}", isoDateTime);

        log.info("custom.date: {}", customDate);
        log.info("custom.time: {}", customTime);
        log.info("custom.date-time: {}", customDateTime);

    }

}
