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

    @Test
    void addGems3() {
        Gem myGem1 = new Gem("Супер гем");
        Occurrence ground = new Occurrence("Люксеембург");
        Owner myOwner = new Owner("Самон");
        Price myPrice = new Price(25);
        Auction myAuc = new Auction("Солсбери");

        myGem1.setOccurrence(ground);
        myGem1.setType("Каменный");
//        myGem1.setPrice(myPrice);
        myGem1.setOwner(myOwner);

        occurrenceInterface.saveAndFlush(ground);
        ownerInterface.saveAndFlush(myOwner);
        priceInterface.saveAndFlush(myPrice);
        auctionInterface.saveAndFlush(myAuc);
        gemInterface.saveAndFlush(myGem1);

    }

    @Test
    void gemExperements() {
        Gem myGem = new Gem("Сапфир Бомбея");
        Occurrence ground = new Occurrence("Шри-Ланка");
        Owner myOwner = new Owner("Елизавета II");
        Price myPrice = new Price(100000000);
        Auction myAuc = new Auction("Солсбери");

        myGem.setType("Чистый Сапфир");
        ground.setDate("01.01.1987");
        ground.setPlace("Деревня");

        myOwner.setCity("Лондон");
        myOwner.setContact("+79610865432");

        myPrice.setFinal_price(1000000000);
        myPrice.setCurrency("USD");

        myAuc.setCity("Нью Йорк");
        myAuc.setDate("01.11.2025");

        myGem.setOwner(myOwner);
        myGem.setOccurrence(ground);

        myPrice.setGem(myGem);

        myAuc.setGem(myGem);


//        occurrenceInterface.save(ground);
//        ownerInterface.save(myOwner);
//        priceInterface.save(myPrice);
//        auctionInterface.save(myAuc);
//        gemInterface.save(myGem);

        occurrenceInterface.saveAndFlush(ground);
        ownerInterface.saveAndFlush(myOwner);
        priceInterface.saveAndFlush(myPrice);
        auctionInterface.saveAndFlush(myAuc);
        gemInterface.saveAndFlush(myGem);

    }


}
