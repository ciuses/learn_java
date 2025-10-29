package ru.ciuse.hw_5_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ciuse.hw_5_web.any_repo.CRUDRepo;
import ru.ciuse.hw_5_web.model.Gem;


@Controller
@RequestMapping("/site")
public class HTTPControl {

    @Autowired
    private CRUDRepo crudRepo;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/gems")
    public String gemListView(Model model) {

        Iterable<Gem> myGems = crudRepo.findAll();

        model.addAttribute("gems", myGems);

        return "gemList";
    }
}
