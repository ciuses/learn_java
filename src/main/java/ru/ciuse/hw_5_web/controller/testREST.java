package ru.ciuse.hw_5_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import ru.ciuse.hw_5_web.any_repo.CRUDRepo;
import ru.ciuse.hw_5_web.model.Gem;


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

    @GetMapping("/gem")
    public Gem getGem() {

        Gem myTestGem = new Gem("MySuperGem");

        System.out.println(myTestGem);

        return myTestGem;

    }
}
