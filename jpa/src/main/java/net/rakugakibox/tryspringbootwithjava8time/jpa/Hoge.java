package net.rakugakibox.tryspringbootwithjava8time.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hoge {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private LocalDate hogeDate;

    @Column
    private LocalTime hogeTime;

    @Column
    private LocalDateTime hogeDateTime;

}
