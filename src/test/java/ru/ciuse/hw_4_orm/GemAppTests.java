package ru.ciuse.hw_4_orm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.ciuse.hw_4_orm.entity.*;
import ru.ciuse.hw_4_orm.my_repo.*;

@SpringBootTest
class GemAppTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    GemInterface gemInterface;

    @Autowired
    AuctionInterface auctionInterface;
    @Autowired
    OccurrenceInterface occurrenceInterface;
    @Autowired
    OwnerInterface ownerInterface;
    @Autowired
    PriceInterface priceInterface;

    @Test
    void addGems() {
        Gem myGem1 = new Gem("пуь");
        Gem myGem2 = new Gem("Брилиант");
        gemInterface.saveAndFlush(myGem1);
        gemInterface.saveAndFlush(myGem2);

    }

    @Test
    void addGems2() {
        Gem myGem1 = new Gem("Тестовый камень");
        Occurrence ground = new Occurrence("Казахстан");
        Owner myOwner = new Owner("Медведь");
        Price myPrice = new Price(500);
        Auction myAuc = new Auction("Крисити");

        gemInterface.saveAndFlush(myGem1);
        occurrenceInterface.saveAndFlush(ground);
        ownerInterface.saveAndFlush(myOwner);
        priceInterface.saveAndFlush(myPrice);
        auctionInterface.saveAndFlush(myAuc);

    }

}
