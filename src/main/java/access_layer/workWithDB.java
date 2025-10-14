package access_layer;

import entity.Gem;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class workWithDB implements accessToDB<Gem, Long, Integer> {
    private final List<Gem> gemContainer;

    @Autowired
    public workWithDB(List<Gem> gemContainer) {
        this.gemContainer = gemContainer;
    }

    @Override
    public void create(Gem anyGem) {
        // логика создания
        gemContainer.add(anyGem);
    }

    @Override
    public Gem read(Long gemId) {
        // логика чтения
        Gem anyEntity = gemContainer.stream()
                .filter(myObj -> Objects.equals(myObj.getGemId(), gemId))
                .findFirst().orElse(null);
        return anyEntity;
    }

    @Override
    public void update(Long gemId, Integer gemPrice) {
        // логика изменения
        Gem oldEntity = gemContainer.stream().filter(myObj -> Objects.equals(myObj.getGemId(), gemId)).findFirst().orElse(null);
        gemContainer.removeIf(myObj -> Objects.equals(myObj.getGemId(), gemId));
        Gem newEntity = new Gem(gemId, oldEntity.getGemType(), oldEntity.getGemName(), gemPrice);
        create(newEntity);
    }

    @Override
    public void delete(Long gemId) {
        // логика логика удаления
        gemContainer.removeIf(myObj -> Objects.equals(myObj.getGemId(), gemId));
    }

}
