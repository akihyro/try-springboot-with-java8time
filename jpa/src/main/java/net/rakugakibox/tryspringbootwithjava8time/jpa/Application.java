package net.rakugakibox.tryspringbootwithjava8time.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {Application.class, Jsr310JpaConverters.class})
@Slf4j
public class Application implements ApplicationRunner {

    @Autowired
    private HogeRepository hogeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Hoge hoge = new Hoge(null, LocalDate.now(), LocalTime.now(), LocalDateTime.now());
        hoge = hogeRepository.save(hoge);
        log.info("save: {}", hoge);

        List<Hoge> hogeList = hogeRepository.findAll();
        log.info("findAll: {}", hogeList);

    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
