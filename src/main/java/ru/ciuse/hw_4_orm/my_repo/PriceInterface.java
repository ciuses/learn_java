package ru.ciuse.hw_4_orm.my_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ciuse.hw_4_orm.entity.Price;
import java.util.List;

@Repository
public interface PriceInterface extends JpaRepository<Price, Integer> {

    List<Price> findByStarting(Integer starting);
    List<Price> findByStartingOrCurrency(Integer starting, String currency);
}
