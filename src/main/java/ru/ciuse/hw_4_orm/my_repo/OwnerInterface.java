package ru.ciuse.hw_4_orm.my_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ciuse.hw_4_orm.entity.Owner;

@Repository
public interface OwnerInterface extends JpaRepository<Owner, Integer> {
}
