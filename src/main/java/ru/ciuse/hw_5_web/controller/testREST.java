package ru.ciuse.hw_5_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import ru.ciuse.hw_5_web.any_repo.CRUDRepo;
import ru.ciuse.hw_5_web.any_repo.CRUDRepo;
import ru.ciuse.hw_5_web.any_repo.OccurrenceRepo;
import ru.ciuse.hw_5_web.model.Gem;
import ru.ciuse.hw_5_web.model.Occurrence;

import java.util.List;


//@RestController
//@RequestMapping("/test/check_gem")
//public class testREST {
//
//    @Autowired
//    private CRUDRepo crudRepo;
//
//    @GetMapping("/gem")
//    public Object getGem() {
//
//        Object myGem = crudRepo.findById(3);
//        System.out.println(myGem);
//
//        return myGem;
//
//    }
//}


@RestController
@RequestMapping("/test2")
public class testREST {

    @Autowired
    OccurrenceRepo occurrenceRepo;

    @Autowired
    CRUDRepo crudRepo;

    @GetMapping("/gem")
    public Gem getGem() {

        Gem myTestGem = new Gem("MySuperGem");

        System.out.println(myTestGem);

        return myTestGem;

    }

    @GetMapping("/place")
    public List<Occurrence> getPlaces() {

        List<Occurrence> myPlace =  occurrenceRepo.findByMyCustomDate("01.01.2000");

        return myPlace;
    }

    @GetMapping("/gems")
    public Iterable<Gem> getGems() {

        Iterable<Gem> myGems = crudRepo.findAll();

        System.out.println(myGems);

        return myGems;
    }

}
