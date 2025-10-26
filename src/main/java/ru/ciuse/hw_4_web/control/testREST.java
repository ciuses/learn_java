package ru.ciuse.hw_4_web.control;

import jakarta.validation.constraints.Null;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ciuse.hw_4_orm.entity.Gem;

@RestController
@RequestMapping("/test")
public class testREST {

    @GetMapping("/gem")
    public String getGem() {
        return "Какой то гем";
    }
}
