package ru.ciuse.hw_4_orm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ciuse.hw_4_orm.entity.Gem;
import ru.ciuse.hw_4_orm.my_repo.GemInterface;

@SpringBootTest
class GemAppTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    GemInterface gemInterface;

    @Test
    void addGems() {
        Gem myGem1 = new Gem("MySeperDuperGem");
        Gem myGem2 = new Gem("Рубин");
        gemInterface.saveAndFlush(myGem1);
        gemInterface.saveAndFlush(myGem2);

    }

}
