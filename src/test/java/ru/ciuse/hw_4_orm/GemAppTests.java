package ru.ciuse.hw_4_orm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ru.ciuse.hw_4_orm.entity.*;
import ru.ciuse.hw_4_orm.my_repo.*;

import java.util.List;

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

    @Autowired
    OccurrenceCRUDRepo occurrenceCRUDRepo;

//    @Test
//    void addGems() {
//        Gem myGem1 = new Gem("пуь");
//        Gem myGem2 = new Gem("Брилиант");
//        gemInterface.saveAndFlush(myGem1);
//        gemInterface.saveAndFlush(myGem2);
//
//    }
//
//    @Test
//    void addGems2() {
//        Gem myGem1 = new Gem("Тестовый камень");
//        Occurrence ground = new Occurrence("Казахстан");
//        Owner myOwner = new Owner("Медведь");
//        Price myPrice = new Price(500);
//        Auction myAuc = new Auction("Крисити");
//
//        gemInterface.saveAndFlush(myGem1);
//        occurrenceInterface.saveAndFlush(ground);
//        ownerInterface.saveAndFlush(myOwner);
//        priceInterface.saveAndFlush(myPrice);
//        auctionInterface.saveAndFlush(myAuc);
//
//    }
//
//    @Test
//    void addGems3() {
//        Gem myGem1 = new Gem("Супер гем");
//        Occurrence ground = new Occurrence("Люксеембург");
//        Owner myOwner = new Owner("Самон");
//        Price myPrice = new Price(25);
//        Auction myAuc = new Auction("Солсбери");
//
//        myGem1.setOccurrence(ground);
//        myGem1.setType("Каменный");
////        myGem1.setPrice(myPrice);
//        myGem1.setOwner(myOwner);
//
//        occurrenceInterface.saveAndFlush(ground);
//        ownerInterface.saveAndFlush(myOwner);
//        priceInterface.saveAndFlush(myPrice);
//        auctionInterface.saveAndFlush(myAuc);
//        gemInterface.saveAndFlush(myGem1);
//
//    }

//    @Test
//    void gemExperements() {
////        Gem myGem = new Gem("Сапфир Бомбея");
////        Occurrence ground = new Occurrence("Шри-Ланка");
////        Owner myOwner = new Owner("Елизавета II");
////        Price myPrice = new Price(100000000);
////        Auction myAuc = new Auction("Солсбери");
////
////        ground.setDate("01.01.1987");
////        ground.setPlace("Деревня");
////
////        myOwner.setCity("Лондон");
////        myOwner.setContact("+79610865432");
////
////        myPrice.setFinal_price(1000000000);
////        myPrice.setCurrency("USD");
////
////        myAuc.setCity("Нью Йорк");
////        myAuc.setDate("01.11.2025");
////
////        myGem.setType("Чистый Сапфир");
////        myGem.setOwner(myOwner);
////        myGem.setOccurrence(ground);
////
////        myPrice.setGem(myGem);
////
////        myAuc.setGem(myGem);
//
//
//        Gem myGem = new Gem("Янтарь");
//        Occurrence ground = new Occurrence("Эстония");
//        Owner myOwner = new Owner("Калис");
//        Price myPrice = new Price(50);
//        Auction myAuc = new Auction("Московская биржа");
//
//        ground.setDate("24.05.2014");
//        ground.setPlace("Рига");
//
//        myOwner.setCity("Серпухово");
//        myOwner.setContact("+34507132211");
//
//        myPrice.setFinal_price(100);
//        myPrice.setCurrency("TG");
//
//        myAuc.setCity("Дублин");
//        myAuc.setDate("03.02.2026");
//
//        myGem.setType("Там ДНК");
//        myGem.setOwner(myOwner);
//        myGem.setOccurrence(ground);
//
//        myPrice.setGem(myGem);
//
//        myAuc.setGem(myGem);
//
//
//
//        occurrenceInterface.saveAndFlush(ground);
//        ownerInterface.saveAndFlush(myOwner);
//        priceInterface.saveAndFlush(myPrice);
//        auctionInterface.saveAndFlush(myAuc);
//        gemInterface.saveAndFlush(myGem);
//
//    }

    @Test
    @Transactional
    void mySelect() {
        Gem any_gem = gemInterface.getReferenceById(3);
        List<Gem> gemList = gemInterface.findAll();
        System.out.println(any_gem);
        System.out.println(any_gem.getName());
        System.out.println(any_gem.getOccurrence());
        System.out.println(gemList);
    }

//    @Test
//    @Transactional
//    void selectMinPrice() {
//
//        List<Price> anyPrices = priceInterface.findByStarting(50);
//        System.out.println(anyPrices);
//
//        List<Price> anotherPrices = priceInterface.findByStartingOrCurrency(50, "USD");
//        System.out.println(anotherPrices);
//
//    }


//    @Test
//    @Transactional
//    void selectCountry() {
//
//        List<Occurrence> myCountry = occurrenceCRUDRepo.findByCountry("Россия");
//        System.out.println(myCountry);
//
//        List<Occurrence> myCountry2 = occurrenceCRUDRepo.findByMyCustomDate("2000");
//        System.out.println(myCountry2);
//
//
//
//    }

    @Test
    @Transactional
    void selectCriteria() {

//        AucRepoImpl meGet = new AucRepoImpl();

//        List myList = meGet.findByCity("Нью Йорк");
//        System.out.println(myList);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hw_2_java_db");
        EntityManager em = factory.createEntityManager();

//        @PersistenceContext
//        private EntityManager entityManager;

        CriteriaBuilder myCritBild = em.getCriteriaBuilder();
        CriteriaQuery<Auction> myCritQ = myCritBild.createQuery(Auction.class);

        Root<Auction> aucRoot = myCritQ.from(Auction.class);
        Predicate cityPredict = myCritBild.equal(aucRoot.get("city"), "Нью Йорк");

        myCritQ.select(aucRoot).where(cityPredict);

        List myList =  em.createQuery(myCritQ).getResultList();
        System.out.println(myList);







    }


}
