package ru.ciuse.hw_4_orm.my_repo;

import ru.ciuse.hw_4_orm.entity.Auction;

import java.util.List;
import java.util.Locale;

public interface AucRepoCustom {

    List<Auction> findByCity(String city);
    List<Auction> findByName(String name);

}
