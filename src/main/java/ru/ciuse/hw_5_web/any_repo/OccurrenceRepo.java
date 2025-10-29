package ru.ciuse.hw_5_web.any_repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ciuse.hw_5_web.model.Occurrence;

import java.util.List;


@RepositoryRestResource(path = "my_place")
public interface OccurrenceRepo extends CrudRepository<Occurrence, Integer> {

    @Query("FROM Occurrence WHERE date > :my_date")
    List<Occurrence> findByMyCustomDate(String my_date);

}
