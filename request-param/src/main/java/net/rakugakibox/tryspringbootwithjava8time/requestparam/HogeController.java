package net.rakugakibox.tryspringbootwithjava8time.requestparam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HogeController {

    @RequestMapping("/hoge")
    public Map hoge(
            @RequestParam(required = false) LocalDate defaultDate,
            @RequestParam(required = false) LocalTime defaultTime,
            @RequestParam(required = false) LocalDateTime defaultDateTime,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate isoDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime isoTime,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime isoDateTime
    ) {
        Map<String, String> map = new HashMap<>();
        if (defaultDate != null) {
            map.put("defaultDate", defaultDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (defaultTime != null) {
            map.put("defaultTime", defaultTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        }
        if (defaultDateTime != null) {
            map.put("defaultDateTime", defaultDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        }
        if (isoDate != null) {
            map.put("isoDate", isoDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        if (isoTime != null) {
            map.put("isoTime", isoTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        }
        if (isoDateTime != null) {
            map.put("isoDateTime", isoDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        }
        return map;
    }

}
