package ru.ciuse.hw_2_java_db.logic;

import ru.ciuse.hw_2_java_db.entity.Gem;

public interface GemService {
    void createGem (Long gemId, String gemType, String gemName, Integer gemPrice);
    Gem findById (Long gemId);
    void updatePrice (Long gemId, Integer newPrice);
    void deleteById (Long gemId);

}
