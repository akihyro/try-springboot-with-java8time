@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(value = LocalDateXmlAdapter.class, type = LocalDate.class),
    @XmlJavaTypeAdapter(value = LocalTimeXmlAdapter.class, type = LocalTime.class),
    @XmlJavaTypeAdapter(value = LocalDateTimeXmlAdapter.class, type = LocalDateTime.class)
})
package net.rakugakibox.tryspringbootwithjava8time.jaxb;

import com.migesok.jaxb.adapter.javatime.LocalDateTimeXmlAdapter;
import com.migesok.jaxb.adapter.javatime.LocalDateXmlAdapter;
import com.migesok.jaxb.adapter.javatime.LocalTimeXmlAdapter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
