package ru.ciuse.hw_4_orm.my_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ciuse.hw_4_orm.entity.Occurrence;

@Repository
public interface OccurrenceInterface extends JpaRepository<Occurrence, Integer> {
}
