package ru.ciuse.hw_4_orm.my_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ciuse.hw_4_orm.entity.Auction;

@Repository
public interface AuctionInterface extends JpaRepository<Auction, Integer> {
}
