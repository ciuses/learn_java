package logic;

import entity.Gem;

public interface gemService {
    void createGem (Long gemId, String gemType, String gemName, Integer gemPrice);
    Gem findById (Long gemId);
    void updatePrice (Long gemId, Integer newPrice);
    void deleteById (Long gemId);

}
