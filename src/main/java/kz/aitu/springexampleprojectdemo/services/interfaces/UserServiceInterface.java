package kz.aitu.springexampleprojectdemo.services.interfaces;

import kz.aitu.springexampleprojectdemo.models.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);
}
