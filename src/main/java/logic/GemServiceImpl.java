package logic;


import access_layer.workWithDB;
import entity.Gem;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class GemServiceImpl implements gemService {

    private final workWithDB workWithDB;

    @Autowired
    public GemServiceImpl (workWithDB workWithDB) {
        this.workWithDB = workWithDB;

    }

    @Override
    public void createGem (Long gemId, String gemType, String gemName, Integer gemPrice) {

        Gem myGem = new Gem(gemId, gemType, gemName, gemPrice);
        workWithDB.create(myGem);

    }

    @Override
    public Gem findById (Long gemId) {

        return workWithDB.read(gemId);
    }

    @Override
    public void updatePrice (Long gemId, Integer gemPrice) {

        workWithDB.update(gemId, gemPrice);
    }

    @Override
    public void deleteById (Long gemId) {

        workWithDB.delete(gemId);
    }

}
