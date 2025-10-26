package ru.ciuse.hw_5_web.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ciuse.hw_4_orm.entity.Gem;
import ru.ciuse.hw_4_orm.my_repo.*;
import java.util.List;


@RestController
@RequestMapping("/test")
public class testREST {

    @Autowired
    private GemInterface gemInterface;

    @GetMapping("/gem")
    public List<Gem> getGem() {

        List<Gem> myGems = gemInterface.findAll();
        System.out.println(myGems);

        return myGems;

    }
}
