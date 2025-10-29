package ru.ciuse.hw_5_web.any_repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ciuse.hw_5_web.model.Auction;



@RepositoryRestResource(path = "auc")
public interface AucRepo extends CrudRepository<Auction, Integer> {

//    public Optional<Gem> findById(Integer gem_id);

}
