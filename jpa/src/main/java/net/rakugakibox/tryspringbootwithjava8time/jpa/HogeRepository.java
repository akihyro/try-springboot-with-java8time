package net.rakugakibox.tryspringbootwithjava8time.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HogeRepository extends JpaRepository<Hoge, Integer> {
}
