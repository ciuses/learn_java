package ru.ciuse.hw_2_java_db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ciuse.hw_4_orm.entity.Gem;
import ru.ciuse.hw_4_orm.my_repo.GemInterface;

@SpringBootTest
class Hw2JavaDbApplicationTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    GemInterface gemInterface;

    @Test
    void addGems() {
        Gem myGem1 = new Gem("MySeperDuperGem");
        gemInterface.saveAndFlush(myGem1);

    }

}
