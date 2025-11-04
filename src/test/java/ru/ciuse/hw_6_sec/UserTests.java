package ru.ciuse.hw_6_sec;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import ru.ciuse.hw_5_web.WebApp;
import ru.ciuse.hw_5_web.any_repo.UserRepo;
import ru.ciuse.hw_5_web.model.User;


@SpringBootTest(classes = WebApp.class)
public class UserTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserRepo userRepo;

    @Test
    @Transactional
    void TestMyUser() {

//        User anyUser = new User();
//
//        anyUser.setName("ciuse");
//        anyUser.setPas("zxcvbn");
//        User result = userRepo.save(anyUser);
//        System.out.println(result);
        
//        userRepo.saveAndFlush(anyUser);

        User anyUser = userRepo.findByName("test");
        System.out.println(anyUser);
        System.out.println(anyUser.getName());
        System.out.println(anyUser.getPas());

    }

}
