package net.rakugakibox.tryspringbootwithjava8time.jackson;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HogeController {

    private Hoge hoge = new Hoge();

    @RequestMapping(value = "/hoge", method = RequestMethod.GET)
    public Hoge getHoge() {
        log.info("hoge: {}", hoge);
        return hoge;
    }

    @RequestMapping(value = "/hoge", method = RequestMethod.POST)
    public Hoge setHoge(@RequestBody Hoge hoge) {
        log.info("hoge: {}", hoge);
        this.hoge = hoge;
        return hoge;
    }

}
