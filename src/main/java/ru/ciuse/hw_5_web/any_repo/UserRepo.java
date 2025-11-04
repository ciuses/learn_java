package ru.ciuse.hw_5_web.any_repo;


import org.springframework.data.repository.CrudRepository;
import ru.ciuse.hw_5_web.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

    public User findByName(String name);
}
