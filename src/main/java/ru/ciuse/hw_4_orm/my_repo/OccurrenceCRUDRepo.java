package ru.ciuse.hw_4_orm.my_repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.ciuse.hw_4_orm.entity.Occurrence;
import java.util.List;


public interface OccurrenceCRUDRepo extends CrudRepository<Occurrence, Integer> {

    List<Occurrence> findByCountry(String country);

    @Query("FROM Occurrence WHERE date > :my_date")
    List<Occurrence> findByMyCustomDate(String my_date);
}
