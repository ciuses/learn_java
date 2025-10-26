package ru.ciuse.hw_4_orm.my_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.ciuse.hw_4_orm.entity.Gem;

@Repository
@RepositoryRestResource(path = "gem")
public interface GemInterface extends JpaRepository<Gem, Integer> {
}
